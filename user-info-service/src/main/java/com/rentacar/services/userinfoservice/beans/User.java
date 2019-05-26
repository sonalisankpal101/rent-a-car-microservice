package com.rentacar.services.userinfoservice.beans;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {

    public User() {
        super();
    }

    @Id
    @Column(name = "USERID")
    private String userId;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "ADDRESS")
    private String address;
}
