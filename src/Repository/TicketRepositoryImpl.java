package Repository;

import Model.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Implementation of TicketRepository interface for managing tickets
public class TicketRepositoryImpl implements TicketRepository{

    // List to store tickets
    private final List<Ticket> ticketList = new ArrayList<>();

    // Save a ticket to the repository
    @Override
    public Ticket save(Ticket ticket) {
        ticketList.add(ticket);  // Add the ticket to the list
        return ticket;  // Return the saved ticket
    }

    // Retrieve a ticket by its ID
    @Override
    public Optional<Ticket> getTicketById(long ticketId) {
        for(Ticket ticket : ticketList){
            if(ticket.getId() == ticketId){
                return Optional.of(ticket); // Return the ticket if its ID matches the provided ID
            }
        }
        return Optional.empty(); // Return empty Optional if no matching ticket is found
    }
}
