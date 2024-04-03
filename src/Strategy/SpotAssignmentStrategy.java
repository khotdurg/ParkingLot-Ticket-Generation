package Strategy;

import Model.ParkingLot;
import Model.ParkingSpot;
import Model.VehicleType;

import java.util.Optional;

public interface SpotAssignmentStrategy {
    Optional<ParkingSpot> assignSpot(ParkingLot parkingLot, VehicleType vehicleType);
}
