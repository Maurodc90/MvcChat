package com.maurodelcore.mvcChat.model;

/**
 * Model class representing a single chat message.
 * Not a Spring bean — a new instance is created for each message
 * entered during the chat session.
 */
public class Message {
    private String text;

    /**
     * Creates a new Message with the specified text.
     *
     * @param text the message content
     */
    public Message(String text) {
        this.text = text;
    }

    /**
     * Returns the message content.
     *
     * @return the message text
     */
    public String getText() {
        return text;
    }

}