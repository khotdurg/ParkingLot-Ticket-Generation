package Model;

public class Vehicle extends BaseModel{
    private String registrationNumber;
    private VehicleType vehicleType;


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = VehicleType.valueOf(vehicleType);
    }

    public void setVehicleType(VehicleType vehicleType) {

    }
}
