package com.rentacar.services.carbooking.carbookingservice.controller;

import com.rentacar.services.carbooking.carbookingservice.beans.Car;
import com.rentacar.services.carbooking.carbookingservice.beans.User;
import com.rentacar.services.carbooking.carbookingservice.client.BookingService;
import com.rentacar.services.carbooking.carbookingservice.client.UserInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "carBooking" ,tags = "User")
public class CarBookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value="/carInfo", method = RequestMethod.GET )
    @ApiOperation(value = "get all cars", notes = "get all cars from the system", nickname = "getCars")
    public List<Car> getAllCars(@RequestParam(name="carId",required = false) String carId){
        return this.bookingService.getAllCars(carId);
    }

    @RequestMapping(value="/userInfo",method= RequestMethod.GET)
    @ApiOperation(value = "get user by ID", notes = "get user using system currently", nickname = "getUser")
    public List<User> getUser(@RequestParam(name="userId",required = false) String userId) {
        return this.userInfoService.getUser(userId);
    }
}
