package com.example.juniorprogrammer.apicrud.services;

import com.example.juniorprogrammer.apicrud.entities.CarEntity;
import com.example.juniorprogrammer.apicrud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CarServiceImpl implements CarService
{
    @Autowired
    CarRepository carRepository;

    @Override
    public CarEntity addCar(CarEntity param) {
        return null;
    }
}
