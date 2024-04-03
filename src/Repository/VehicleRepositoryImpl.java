package Repository;

import Model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Implementation of VehicleRepository interface for managing vehicles
public class VehicleRepositoryImpl implements VehicleRepository{

    // List to store vehicles
    private final List<Vehicle> vehicles = new ArrayList<>();

    // Retrieve a vehicle by its registration number
    @Override
    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber) {
        for(Vehicle vehicle : vehicles){
            if(vehicle.getRegistrationNumber() == registrationNumber){
                return Optional.of(vehicle);  // Return the vehicle if its registration number matches the provided one
            }
        }
        return Optional.empty(); // Return empty Optional if no matching vehicle is found
    }

    // Save a vehicle to the repository
    @Override
    public Vehicle save(Vehicle vehicle) {
        vehicles.add(vehicle); // Add the vehicle to the list
        return vehicle; // Return the saved vehicle
    }
}
