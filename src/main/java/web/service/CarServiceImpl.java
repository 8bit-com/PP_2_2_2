package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Mers", 12, "black"));
        carList.add(new Car("Hyundai", 23, "white"));
        carList.add(new Car("Land Rover", 34, "green"));
        carList.add(new Car("Peugeot", 56, "pink"));
        carList.add(new Car("Volkswagen", 78, "orange"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
