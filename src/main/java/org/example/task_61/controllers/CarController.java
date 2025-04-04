package org.example.task_61.controllers;
import org.example.task_61.services.CarService;
import org.example.task_61.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/getCars")
    public String getCars() {
        return "getCars";
    }


    @PostMapping("/getCars")
    public String postCars(@RequestParam(defaultValue = "5") int count,
                             ModelMap model){
        List<Car> carList = carService.getCars(count);
        model.addAttribute("cars", carList);
        return "getCars";

    }
}
