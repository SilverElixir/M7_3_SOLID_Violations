package main.java.P1_S__Single_Responsibility.S_violation;

/**
 * A class should have only a single responsibility and we only have one reason to change or modify it’s class.
 * If we have another reason to change class then we need to split into different class.
 *
 * In code above shows violation of SRP because CinemaService.java
 * handle the business logic for Tickets and Food services.
 *
 */
public class CinemaService {

    public void buyTickets(){};

    public void returnTickets(){};

    public void updateTickets(){};

    public void buyPopcorn(){};

    public void buyCola(){};




}
