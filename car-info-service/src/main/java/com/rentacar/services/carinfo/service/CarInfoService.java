package com.rentacar.services.carinfo.service;

import com.rentacar.services.carinfo.beans.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarInfoService {

 public  List<Car> getAllCars(){
      Car c = new Car();
      c.setId(1L);
      c.setName("Audi");
      c.setDescription("Audi 01");
      c.setPrice(1000L);

      Car c1 = new Car();
      c1.setId(2L);
      c1.setName("Verna");
      c1.setDescription("Verna 01");
      c1.setPrice(100L);

      List<Car> cars = new ArrayList<Car>();
      cars.add(c);
      cars.add(c1);

      return cars;


  }
}
