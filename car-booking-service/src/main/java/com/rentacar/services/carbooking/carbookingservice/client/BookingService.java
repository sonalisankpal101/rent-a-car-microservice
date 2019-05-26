package com.rentacar.services.carbooking.carbookingservice.client;

import com.rentacar.services.carbooking.carbookingservice.beans.Car;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="CAR-INFO-SERVICE")
public interface BookingService {

    @RequestMapping(value = "/carInfo", method = RequestMethod.GET)
    @ApiOperation(value = "get all cars", notes = "get all cars from the system", nickname = "getCars")
    public List<Car> getAllCars(@RequestParam(name = "carId", required = false) String carId);

}


