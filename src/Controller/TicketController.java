package Controller;

import Service.TicketService;
import dtos.GenerateTicketRequestDto;
import dtos.GenerateTicketResponseDto;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    //This method is used to generate the ticket based on the provided request dto
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){
        return  null;
    }
}
