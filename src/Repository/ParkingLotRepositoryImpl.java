package Repository;

import Model.Gate;
import Model.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Implementation of ParkingLotRepository interface for managing parking lots
public class ParkingLotRepositoryImpl implements ParkingLotRepository{

    // List to store parking lots
    private final List<ParkingLot> parkingLotList = new ArrayList<>();

    // Retrieve a parking lot by gate ID
    @Override
    public ParkingLot getParkingLotByGateId(long gateId) {
       for(ParkingLot parkingLot : parkingLotList){
           List<Gate> gates = parkingLot.getGates();
           for(Gate gate : gates){
               if(gate.getId() == gateId){
                   return Optional.of(parkingLot); // Return the parking lot if its gate matches the provided gate ID
               }
           }
       }
       return Optional.empty(); // Return empty Optional if no matching parking lot is found
    }

    // Retrieve a parking lot by ID
    @Override
    public Optional<ParkingLot> getParkingLotById(long id) {
        for(ParkingLot parkingLot : parkingLotList){
            if(parkingLot.getId() == id){
                return Optional.of(parkingLot); // Return the parking lot if its ID matches the provided ID
            }
        }
        return Optional.empty();  // Return empty Optional if no matching parking lot is found
    }

    // Save a parking lot to the repository
    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        parkingLotList.add(parkingLot); // Add the parking lot to the list
        return parkingLot; // Return the saved parking lot
    }
}
