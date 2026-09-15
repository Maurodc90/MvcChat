package com.maurodelcore.mvcChat;

import com.maurodelcore.mvcChat.handler.ChatHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the MvcChat Spring Boot application.
 * Implements {@link CommandLineRunner} to start the chat session
 * after the application context is fully initialized.
 */
@SpringBootApplication
public class MvcChatApplication implements CommandLineRunner {
    private final ChatHandler chatHandler;

    /**
     * Constructor injection of the {@link ChatHandler} bean.
     *
     * @param chatHandler the controller that manages the chat session
     */
    public MvcChatApplication(ChatHandler chatHandler) {this.chatHandler = chatHandler;}

    /**
     * Starts the messaging session once all beans are ready.
     *
     * @param args command-line arguments (unused)
     * @throws Exception if an unexpected error occurs during the chat session
     */
    @Override
    public void run(String... args) throws Exception {
        chatHandler.startMessaging();
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcChatApplication.class, args);
    }

}