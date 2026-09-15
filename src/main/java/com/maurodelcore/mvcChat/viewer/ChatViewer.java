package com.maurodelcore.mvcChat.viewer;

import com.maurodelcore.mvcChat.model.Message;
import com.maurodelcore.mvcChat.model.User;
import org.springframework.stereotype.Component;

import java.util.Scanner;

/**
 * View layer of the MVC architecture. Handles all console display
 * and user input. No business logic — the {@link com.maurodelcore.mvcChat.handler.ChatHandler}
 * coordinates what to display and when.
 */
@Component
public class ChatViewer {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Displays a sent message in the format: "sender: text to recipient".
     *
     * @param sender    the user who sent the message
     * @param message   the message that was sent
     * @param recipient the intended recipient
     */
    public void printMessage(User sender, Message message, User recipient) {
        System.out.println(sender.getName() + ": " + message.getText() + " to " + recipient.getName());
    }

    /**
     * Reads a non-empty line from the console. Re-prompts if the user
     * submits an empty string. Returns {@code "q"} if the input stream
     * closes unexpectedly, allowing the application to exit gracefully.
     *
     * @return the user's input, or {@code "q"} on scanner failure
     */
    public String readInput() {
        String input = "";
        try {
            input = scanner.nextLine();
            while (input.isEmpty()) {
                System.out.println("Wrong Input try again");
                input = scanner.nextLine();
            }
        } catch (Exception e) {
            displayError(e);
            return "q";
        }
        return input;
    }

    /**
     * Displays the application banner.
     */
    public void displayMenu() {
        System.out.println("=== MvcChat ===");
    }

    /**
     * Prompts for and returns the recipient's username.
     *
     * @return the recipient's username
     */
    public String getSenders() {
        System.out.print("Enter the recipient's username: ");
        return readInput();
    }

    /**
     * Prompts for and returns the sender's username.
     *
     * @return the sender's username
     */
    public String getUsername() {
        System.out.print("Enter your username: ");
        return readInput();
    }

    /**
     * Prompts the current sender to type a message to the recipient.
     * Displays a personalized prompt with both users' names.
     *
     * @param sender    the user whose turn it is to type
     * @param recipient the user the message is addressed to
     * @return the message text, or {@code "q"} to quit
     */
    public String getMessage(User sender, User recipient) {
        System.out.print(sender.getName() + " enter your message to " + recipient.getName() + " or type \"q\" to exit: ");
        return readInput();
    }

    /**
     * Displays a goodbye message when the user exits.
     */
    public void displayExitMessage() {
        System.out.println("Goodbye!");
    }

    /**
     * Displays a visual separator between messages.
     */
    public void displaySeparator() {
        System.out.println("--------------------------------------------------");
    }

    /**
     * Displays an error message to the user.
     *
     * @param e the exception whose message will be displayed
     */
    public void displayError(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }
}