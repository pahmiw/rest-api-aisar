package com.jvmindonesia.restapi.repository;

import com.jvmindonesia.restapi.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
/*    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByModel(@Param("model") String model);

    List<Car> findByFuel(@Param("fuel") String fuel);

    List<Car> findByColor(@Param("color") String color);

    List<Car> findByYear(@Param("year") int year);*/
}
