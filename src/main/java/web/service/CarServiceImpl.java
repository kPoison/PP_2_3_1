package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private CarDao dao = new CarDaoImpl();

    @Override
    public List<Car> getCars() {
        return dao.getCars();
    }

    @Override
    public List<Car> getLimitedListOfCars(int limit) {
        if (limit < 0) {
            limit = 0;
        }

        return getCars().stream().limit(limit).collect(Collectors.toList());
    }
}
