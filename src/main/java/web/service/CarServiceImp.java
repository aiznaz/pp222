package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{

    List<Car> carList = new ArrayList<>();

    public CarServiceImp() {
        carList.add(new Car("Tesla", "Model S", 2015));
        carList.add(new Car("Tesla", "Model X", 2016));
        carList.add(new Car("Tesla", "Model Y", 2020));
        carList.add(new Car("Tesla", "Cybertrack", 2023));
        carList.add(new Car("Tesla", "Roadster", 2008));
    }
    @Override
    public List<Car> listOfCars(int num) {
        return carList.stream().limit(num).collect(Collectors.toList());
    }
}
