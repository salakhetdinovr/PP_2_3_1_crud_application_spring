package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private List<Car> cars;
    {
        cars= new ArrayList<>();
        cars.add(new Car("Ford", 3, 1999));
        cars.add(new Car("Mercedes", 211, 2005));
        cars.add(new Car("Skoda", 7, 2017));
        cars.add(new Car("BMW", 525, 2022));
        cars.add(new Car("Nissan", 1, 2000));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
