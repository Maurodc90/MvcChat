package com.maurodelcore.mvcChat.model;


// Object User store the name, will be set as sender or recipent
public class User {
    private String name;

    public User(String name){
        this.name = name;
    };

    public String getName() {
        return name;
    }

}
