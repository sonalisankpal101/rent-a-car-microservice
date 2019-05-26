package com.rentacar.services.carbooking.carbookingservice.beans;


import lombok.Data;
import org.springframework.stereotype.Component;


import java.io.Serializable;

@Component
@Data
public class Car implements Serializable {

    public Car() {
        super();
    }

    private Long id;
    private String name;
    private String description;
    private Long price;
}

