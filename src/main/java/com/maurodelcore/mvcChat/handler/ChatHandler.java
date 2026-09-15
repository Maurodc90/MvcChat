package com.maurodelcore.mvcChat.handler;

import com.maurodelcore.mvcChat.model.Message;
import com.maurodelcore.mvcChat.model.User;
import com.maurodelcore.mvcChat.viewer.ChatViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Controller layer of the MVC architecture. Coordinates the chat session
 * by delegating all display and input to {@link ChatViewer} and managing
 * the messaging loop. Alternates turns between two users sharing the
 * same console.
 */
@Component
public class ChatHandler {

    @Autowired
    private ChatViewer chatViewer;

    /**
     * Runs the main chat loop. Collects usernames, creates {@link User}
     * objects once, then alternates turns between sender and recipient
     * until one of them types {@code "q"} to quit.
     */
    public void startMessaging() {

        chatViewer.displayMenu();
        int iterator = 0;

        User sender = new User(chatViewer.getUsername());
        User recipient = new User(chatViewer.getSenders());

        while (true) {
            User currentSender;
            User currentRecipient;
            if (iterator % 2 == 0) {
                currentSender = sender;
                currentRecipient = recipient;
            } else {
                currentSender = recipient;
                currentRecipient = sender;
            }
            iterator++;
            chatViewer.displaySeparator();
            String message = chatViewer.getMessage(currentSender, currentRecipient);

            if (message.equals("q")) {
                chatViewer.displayExitMessage();
                break;
            } else {
                chatViewer.printMessage(currentSender, new Message(message), currentRecipient);
            }
        }
    }
}