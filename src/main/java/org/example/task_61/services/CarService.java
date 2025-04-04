package org.example.task_61.services;
import org.example.task_61.models.Car;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface CarService {
    List<Car> getCars(int count);
}
