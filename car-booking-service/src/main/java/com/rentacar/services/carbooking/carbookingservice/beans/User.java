package com.rentacar.services.carbooking.carbookingservice.beans;

import lombok.Data;
import org.springframework.stereotype.Component;


@Component
@Data
public class User {

    public User() {
        super();
    }


    private String userId;
    private String firstName;
    private String lastName;
    private String address;
}
