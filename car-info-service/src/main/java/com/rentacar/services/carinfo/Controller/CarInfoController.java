package com.rentacar.services.carinfo.Controller;

import com.google.common.collect.Lists;
import com.netflix.discovery.util.StringUtil;
import com.rentacar.services.carinfo.beans.Car;
import com.rentacar.services.carinfo.repository.CarRepository;
import com.rentacar.services.carinfo.service.CarInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/carInfo")
@Api(value = "carInfo" ,tags = "cars")
public class CarInfoController {

    @Autowired
    CarInfoService carInfoService;

    @Autowired
    CarRepository carRepository;

    @RequestMapping(method= RequestMethod.GET)
    @ApiOperation(value = "get all cars", notes = "get all cars from the system", nickname = "getCars")
    public List<Car> getAllCars(@RequestParam(name="carName",required = false) String carName){
        if(StringUtils.isNotEmpty(carName)){
            return Collections.singletonList(this.carRepository.findByName(carName));
        }
    return (List<Car>) this.carRepository.findAll();

    }

}
