package com.rentacar.services.userinfoservice.Controller;

import com.rentacar.services.userinfoservice.beans.User;
import com.rentacar.services.userinfoservice.repository.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/userInfo")
@Api(value = "userInfo" ,tags = "User")
public class UserInfoController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method= RequestMethod.GET)
    @ApiOperation(value = "get user by ID", notes = "get user using system currently", nickname = "getUser")
    public List<User> getUser(@RequestParam(name="userId",required = false) String userId){
        if(StringUtils.isNotEmpty(userId)){
            return Collections.singletonList(this.userRepository.findByUserId(userId));
        }
        return (List<User>) this.userRepository.findAll();

    }
}
