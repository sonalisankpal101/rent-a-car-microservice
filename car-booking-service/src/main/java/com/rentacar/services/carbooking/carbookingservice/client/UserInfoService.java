package com.rentacar.services.carbooking.carbookingservice.client;

import com.rentacar.services.carbooking.carbookingservice.beans.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="USERINFOSERVICE", fallback = UserServiceFallBackImpl.class)
public interface UserInfoService {

    @RequestMapping(value = "/userInfo",method= RequestMethod.GET)
    public List<User> getUser(@RequestParam(name="userId",required = false) String userId);

}


