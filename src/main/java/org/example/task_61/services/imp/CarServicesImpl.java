package org.example.task_61.services.imp;

import org.springframework.stereotype.Component;
import org.example.task_61.models.Car;
import org.example.task_61.services.CarService;
import java.util.Arrays;
import java.util.List;


@Component
public class CarServicesImpl implements CarService {

    @Override
    public List<Car> getCars(int count) {
        List<Car> carList = Arrays.asList(
                new Car("BMW M5", 2000,"BLACK"),
                new Car( "MERCEDES",2003, "GRAY"),
                new Car("LAMBORGHINI",2001, "WHITE"),
                new Car("AUDI", 2005, "BLUE"),
                new Car( "MAZDA", 2010,"BLACK"));
        if(count < carList.size()) {
           return carList.subList(0, count);
        }
        else {
           return carList;
        }
    }
}
