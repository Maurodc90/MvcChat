package com.maurodelcore.mvcChat.viewer;

import com.maurodelcore.mvcChat.model.Message;
import com.maurodelcore.mvcChat.model.User;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ChatViewer {
    private Scanner scanner = new Scanner(System.in);

    public void printMessage(User sender, Message message, User recipient) {
        System.out.println(sender.getName() + ": " + message.getText() + " to " + recipient.getName());
    }

    public String readInput() {
        return scanner.nextLine();
    }

    public void displayMenu(){
        System.out.println("=== MvcChat ===");

    }

}
