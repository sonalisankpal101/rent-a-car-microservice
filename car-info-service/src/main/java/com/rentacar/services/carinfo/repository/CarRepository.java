package com.rentacar.services.carinfo.repository;

import com.rentacar.services.carinfo.beans.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car,Long> {

    Car findByName(String name);


}
