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

    public void startMessaging(){

        while(true){
            System.out.println("Enter your username: ");
            String username = chatViewer.readInput();
            System.out.println("Enter recipient username: ");
            String recipientUsername = chatViewer.readInput();
            System.out.println("Type your message (or 'q' to exit): ");
            String message = chatViewer.readInput();
            if(message.equals("q")){
                break;
            }else {
                chatViewer.printMessage(new User(username), new Message(message), new User(recipientUsername));
                System.out.println("===============");
            }
        }
    }



}
