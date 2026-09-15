# MvcChat

Demonstration of Spring MVC architecture in a text-based, non-web console application built with Spring Boot.

## Description

A command-line chat application where two users exchange messages in alternating turns. Built to practice the Model-View-Controller pattern using Spring Boot's dependency injection and autowiring — without a web frontend.

## Concepts Covered

- **MVC Architecture** — Model (data), View (display/input), Controller (coordination)
- **Spring Boot Autowiring** — `@Component`, `@Autowired`, constructor injection
- **CommandLineRunner** — launching application logic after Spring context is fully initialized
- **Singleton vs Plain Objects** — understanding when to use Spring beans vs `new`

## Project Structure

- `User.java` — Model: represents a chat participant
- `Message.java` — Model: represents a single chat message
- `ChatViewer.java` — View: handles all console display and user input
- `ChatHandler.java` — Controller: coordinates the messaging loop and turn alternation
- `MvcChatApplication.java` — Entry point with `CommandLineRunner`

## Example Output

```
=== MvcChat ===
Enter your username: Mauro
Enter the recipient's username: Elcin
--------------------------------------------------
Mauro enter your message to Elcin or type "q" to exit: Hello
Mauro: Hello to Elcin
--------------------------------------------------
Elcin enter your message to Mauro or type "q" to exit: Hi how are you?
Elcin: Hi how are you? to Mauro
--------------------------------------------------
Mauro enter your message to Elcin or type "q" to exit: q
Goodbye!
```

## Author
Mauro Del Core

## Version
1.0