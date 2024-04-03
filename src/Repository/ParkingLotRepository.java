package Repository;

import Model.ParkingLot;

import java.util.Optional;

public interface ParkingLotRepository {
    public ParkingLot getParkingLotByGateId(long gateId);
    public Optional<ParkingLot> getParkingLotById(long id);
    public ParkingLot save(ParkingLot parkingLot);
}
