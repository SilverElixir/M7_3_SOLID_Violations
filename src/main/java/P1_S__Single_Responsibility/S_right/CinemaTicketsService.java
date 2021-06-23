package main.java.P1_S__Single_Responsibility.S_right;

/**
 * The solution is we need to split CinemaService.java into specific class to handle business logic for
 * Tickets (CinemaTicketsService.java) and Food (CinemaFoodService.java).
 */
public class CinemaTicketsService {

    public void buyTickets(){};

    public void returnTickets(){};

    public void updateTickets(){};
}
