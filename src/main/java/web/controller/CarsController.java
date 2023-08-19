package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarServiceImpl carServiceImpl) {
        this.carService = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count", defaultValue = "5") Integer count,
                           ModelMap model) {

        model.addAttribute("cars", carService.getLimitedListOfCars(count));

        return "cars";
    }
}
