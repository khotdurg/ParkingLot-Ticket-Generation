package Repository;

import Model.Vehicle;

import java.util.Optional;

public interface VehicleRepository {
    public Optional<Vehicle> getVehicleByRegistrationNumber(String registrationNumber);
    public Vehicle save(Vehicle vehicle);
}
