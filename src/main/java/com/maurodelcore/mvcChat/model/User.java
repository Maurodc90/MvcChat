package com.maurodelcore.mvcChat.model;

/**
 * Model class representing a chat participant.
 * Not a Spring bean — instantiated at runtime with {@code new} once
 * the user provides their name via the console.
 */
public class User {
    private String name;

    /**
     * Creates a new User with the specified name.
     *
     * @param name the display name for this chat participant
     */
    public User(String name) {
        this.name = name;
    }

    /**
     * Returns this user's display name.
     *
     * @return the user's name
     */
    public String getName() {
        return name;
    }

}