package com.maurodelcore.mvcChat.model;

import org.springframework.stereotype.Component;

public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
