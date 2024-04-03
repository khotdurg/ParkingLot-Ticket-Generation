package Repository;

import Model.Ticket;

import java.util.Optional;

public interface TicketRepository {
    public Ticket save(Ticket ticket);
    public Optional<Ticket> getTicketById(long ticketId);
}
