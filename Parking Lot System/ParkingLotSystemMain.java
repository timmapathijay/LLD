import vehicle.Car;
import vehicle.Motorcycle;
import vehicle.Truck;
import vehicle.Vehicle;

public class ParkingLotSystemMain {
    public static void main(String[] args){
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addFloor(new ParkingFloor(1, 50));
        parkingLot.addFloor(new ParkingFloor(2 , 100));
        Vehicle altoCar = new Car("JH05BV7532");
        Vehicle truck = new Truck("MH017844");
        Vehicle brezzaCar = new Car("AP040814");
        Vehicle passionBike = new Motorcycle("AP047744");

        // Park - Vehicle
        parkingLot.parkVehicle(altoCar);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(brezzaCar);
        parkingLot.parkVehicle(passionBike);

        // Display - Available Parking Space
        parkingLot.displayAvailableParkingSpace();

        // Unpark Vehicle
        parkingLot.unparkVehicle(truck);

        parkingLot.displayAvailableParkingSpace();



    }
}
