package com.maurodelcore.mvcChat.model;


// Object Message store the text of the message that user exchange
public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
