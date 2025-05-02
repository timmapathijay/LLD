import vehicle.Vehicle;
import vehicle.VehicleType;

public class ParkingSpot {
    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;
    public ParkingSpot(int spotNumber , VehicleType vehicleType){
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }
    public synchronized boolean isParkingSpotAvailable(){
        return parkedVehicle == null;
    }
    public synchronized void parkVehicle(Vehicle vehicle){
        if(isParkingSpotAvailable() && vehicle.getVehicleType().equals(this.vehicleType)){
            this.parkedVehicle = vehicle;
            return;
        }
        throw  new IllegalArgumentException("Invalid vehicle type or spot already occupied");
    }
    public synchronized void unparkVehicle(){
        this.parkedVehicle = null;
    }
    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

}
