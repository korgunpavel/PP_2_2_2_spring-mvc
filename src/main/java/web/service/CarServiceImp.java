package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    public List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Nissan Silvia", "White", 1994));
        cars.add(new Car("Range Rover", "Black", 2019));
        cars.add(new Car("Honda Civic", "Silver", 2008));
        cars.add(new Car("Toyota Supra", "Deep Purple", 1996));
        cars.add(new Car("Mazda RX-8", "Blue", 2003));
    }


    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
