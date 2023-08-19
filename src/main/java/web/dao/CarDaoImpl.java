package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("One", 1, "Red"));
        cars.add(new Car("Two", 2, "Green"));
        cars.add(new Car("Three", 3, "Blue"));
        cars.add(new Car("Four", 4, "Yellow"));
        cars.add(new Car("Five", 5, "Black"));

        return cars;
    }
}
