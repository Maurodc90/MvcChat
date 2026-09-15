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

    // Read the input from the user use try catch to see if the user put an empty string return q if scanner close inexpectedly
    public String readInput() {
        String input = "";
        try {
            input = scanner.nextLine();
            while (input.isEmpty()){
                System.out.println("Wrong Input try again");
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            displayError(e);
            return "q";
        }
        return input;
    }

    public void displayMenu(){
        System.out.println("=== MvcChat ===");
    }

    public void displayError(Exception e){
        System.out.println("An error occurred: " + e.getMessage());
    }

    public String getSenders(){
        System.out.print("Enter the recipient's username: ");
        return readInput();
    }

    public String getUsername(){
        System.out.print("Enter your username: ");
        return readInput();
    }

    public String getMessage(User sender, User recipient){
        System.out.print(sender.getName() + " enter your message to " + recipient.getName() + " or type \"q\" to exit: ");
        return readInput();
    }

    public void displayExitMessage(){
        System.out.println("Goodbye!");
    }
    public void displaySeparator(){
        System.out.println("--------------------------------------------------");
    }


}
