package Exceptiopn;

public class ParkingSpotNotAvailableException extends Exception {
    public ParkingSpotNotAvailableException() {
    }

    public ParkingSpotNotAvailableException(String message) {
        super(message);
    }
}
