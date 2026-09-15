package com.maurodelcore.mvcChat;

import com.maurodelcore.mvcChat.handler.ChatHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcChatApplication implements CommandLineRunner {
	private final ChatHandler chatHandler;

	public MvcChatApplication(ChatHandler chatHandler) {this.chatHandler = chatHandler;}

	@Override
	public void run(String... args) throws Exception {
		chatHandler.startMessaging();

	}

	public static void main(String[] args) {
		SpringApplication.run(MvcChatApplication.class, args);



	}

}
