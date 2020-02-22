package com.jvmindonesia.restapi.controller;

import com.jvmindonesia.restapi.domain.Car;
import com.jvmindonesia.restapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

    @PostMapping
    public Car addNewCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carRepository.deleteById(id);
    }
}
