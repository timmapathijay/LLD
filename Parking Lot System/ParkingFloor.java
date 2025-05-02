import vehicle.Vehicle;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpotList;
    public ParkingFloor(int floorNumber , int numberOfSpots){
        this.floorNumber = floorNumber;
        parkingSpotList = new ArrayList<>(numberOfSpots);
        // Divide spots in ratio of 50:40:10 for bikes , cars , truck
        int numberOfBikesSpots = (int)(numberOfSpots * 0.50);
        int numberOfCarsSpots = (int)(numberOfSpots * 0.40);
        for(int i = 1; i <= numberOfBikesSpots; i++)
            parkingSpotList.add(new ParkingSpot(i , VehicleType.MOTORCYCLE));
        for(int i = numberOfBikesSpots + 1 ; i <= numberOfBikesSpots + numberOfCarsSpots;i++)
            parkingSpotList.add(new ParkingSpot(i ,VehicleType.CAR));
        for(int i = numberOfBikesSpots + numberOfCarsSpots + 1; i <= numberOfSpots; i++)
            parkingSpotList.add(new ParkingSpot(i , VehicleType.TRUCK));

    }
    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(spot.isParkingSpotAvailable() && spot.getVehicleType().equals(vehicle.getVehicleType())){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unparkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpotList){
            if(!spot.isParkingSpotAvailable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unparkVehicle();
                return true;
            }
        }
        return false;
    }
    public int availableSpaceInFloor(){
        int vacantParkingSpotsCount = 0;
        for(ParkingSpot spot : parkingSpotList){
            if(spot.isParkingSpotAvailable())
                vacantParkingSpotsCount += 1;
        }
        return vacantParkingSpotsCount;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
