package org.example;

import java.util.ArrayList;
import java.util.List;

public class CRUDCars implements interfaceCarsCRUD {

    private List<Cars> cars = new ArrayList<Cars>();

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    @Override
    public void addCar(Cars car) {
        cars.add(car);
        System.out.println(car);
        System.out.println(cars);

    }

    @Override
    public void deleteCar(Cars car) {
        cars.remove(car);


    }

    @Override
    public void updateCar(Cars car) {
        cars.remove(car);
        cars.add(car);

    }
}
