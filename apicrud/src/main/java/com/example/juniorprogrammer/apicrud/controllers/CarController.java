package com.example.juniorprogrammer.apicrud.controllers;

import com.example.juniorprogrammer.apicrud.entities.CarEntity;
import com.example.juniorprogrammer.apicrud.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping()
    public String checkApi(){
        return "Hello World";
    }

    @PostMapping(value = "addNewCar")
    public CarEntity addNewCar(@RequestBody CarEntity param) {
        carRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllCar")
    public List<CarEntity> getAllCar(){
        return carRepository.findAll();
    }

    @GetMapping(value = "getById")
    public CarEntity getById(@RequestParam int id){
        //http://localhost:1111/Car/getById?id=1
        return carRepository.findById(id).get();
    }
    @PostMapping(value = "updateCar")
    public CarEntity updateCar(@RequestBody CarEntity param){
        return carRepository.save(param);
    }

    @GetMapping(value = "deleteCar")
    public String deleteCar(@RequestParam int id){
        CarEntity car = carRepository.findById(id).get();
        carRepository.deleteById(id);
        return "Success Delete "+ id;
    }

    @GetMapping(value = "getCarById")
        public CarEntity getCarById(@RequestParam int id) {
        CarEntity car = carRepository.findById(id).get();
        return car;
    }

    //bisa @PathVariable int id asalkan valuenya /{id}

}
