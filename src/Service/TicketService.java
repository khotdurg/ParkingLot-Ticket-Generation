package Service;

import Model.Ticket;
import Exceptiopn.InvalidParkingLotException;
import Exceptiopn.InvalidxGateException;
import Exceptiopn.ParkingSpotNotAvailableException;

public interface TicketService {

    public Ticket generateTicket(int gateId, String registrationNumber, String vehicleType) throws InvalidxGateException, InvalidParkingLotException, ParkingSpotNotAvailableException, InvalidGateException;
}