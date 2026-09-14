package com.maurodelcore.mvcChat.model;

import org.springframework.stereotype.Component;

public class User {
    private String name;

    public User(String name){
        this.name = name;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
