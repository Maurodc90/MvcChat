package com.maurodelcore.mvcChat.handler;

import com.maurodelcore.mvcChat.model.Message;
import com.maurodelcore.mvcChat.model.User;
import com.maurodelcore.mvcChat.viewer.ChatViewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChatHandler {

    @Autowired
    private ChatViewer chatViewer;

    public void startMessaging() {

        // display the menu
        chatViewer.displayMenu();
        int iterator = 0; // initialize iterator

        // create sender and recipient user using chatviewer
        User sender = new User(chatViewer.getUsername());
        User recipient = new User(chatViewer.getSenders());

        while (true) {
            // initialize current sender and recipient
            User currentSender;
            User currentRecipient;
            // depending on the iterator value, assign sender and recipient to currentSender and currentRecipient
            // this is used to alternate between sender and recipient
            if (iterator % 2 == 0) {
                currentSender = sender;
                currentRecipient = recipient;
            } else {
                currentSender = recipient;
                currentRecipient = sender;
            }
            iterator++; // after the if statement the iterator is incremented
            chatViewer.displaySeparator();
            // get message from chatviewer
            String message = chatViewer.getMessage(currentSender, currentRecipient);

            if (message.equals("q")) {
                chatViewer.displayExitMessage();
                break;
            } else {
                // display message from chatviewer and return the start of the while loop
                chatViewer.printMessage(currentSender, new Message(message), currentRecipient);

            }
        }
    }
}

