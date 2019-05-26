package com.rentacar.services.carinfo.beans;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
public class Car implements Serializable {

    public Car() {
        super();
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @Size(min = 20, max = 300)
    @Column(name = "description", length = 300)
    private String description;


    @Column(name = "price")
    private Long price;
}
