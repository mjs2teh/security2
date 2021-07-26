package com.javainuse.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String username;
    @Column
    private String password;


    public User(){

    }
}
