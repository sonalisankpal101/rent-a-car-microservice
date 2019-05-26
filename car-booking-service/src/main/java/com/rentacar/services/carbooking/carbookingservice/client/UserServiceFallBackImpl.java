package com.rentacar.services.carbooking.carbookingservice.client;

import com.rentacar.services.carbooking.carbookingservice.beans.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class UserServiceFallBackImpl implements UserInfoService {

    @Override
    public List<User> getUser(@RequestParam(name="userId",required = false) String userId){
        User user = new User();
        user.setUserId("00");
        user.setFirstName("Dummy");
        user.setLastName("UAE");
        return Collections.singletonList(user);
    }

}
