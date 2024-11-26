package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl {
    private final List<Car> cars = Arrays.asList(
            new Car("Toyota", "Corolla", 2020),
            new Car("Ford", "Mustang", 2021),
            new Car("Tesla", "Model S", 2022),
            new Car("BMW", "X5", 2019),
            new Car("Audi", "A4", 2018)
    );

    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
