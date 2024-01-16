package ru.myproj.les1FirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

// @RestController
public class CarController {

    @Autowired
    Car car;

    @GetMapping("/car")
    public String startCar() {
        car.start();
        return "Автомобиль запущен";
    }
}



