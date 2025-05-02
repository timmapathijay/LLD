import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<ParkingFloor> parkingFloorList;
    private ParkingLot(){
        parkingFloorList = new ArrayList<>();
    }
    public static synchronized ParkingLot getInstance(){
        if(parkingLot == null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }
    public void addFloor(ParkingFloor floor){
     parkingFloorList.add(floor);
    }
    public boolean parkVehicle(Vehicle vehicle){
    for(ParkingFloor floor: parkingFloorList){
        if(floor.parkVehicle(vehicle)){
            System.out.println("Vehicle Number : " +vehicle.getVehicleNumber() + " Parked Successfully");
            return true;
        }
    }
     System.out.println("Unable to park vehicle number : " +vehicle.getVehicleNumber() + "as Parking is full");
     return false;
    }
    public boolean unparkVehicle(Vehicle vehicle){
        for(ParkingFloor floor : parkingFloorList){
            if(floor.unparkVehicle(vehicle)){
                return true;
            }
        }
        return false;
    }
    public void displayAvailableParkingSpace(){
        for(ParkingFloor floor : parkingFloorList) {
            System.out.println("Available Parking Spots at floor number : "+floor.getFloorNumber() +" is "+floor.availableSpaceInFloor());
        }
    }
}
