package TruckVehicle;


public interface TruckVehicle  extends Vehicle {
    void setTheCargoCapacity(int TruckCapacity_tons);
    int getTheCargoCapacity();


    void setTransmissionType(String transmissionType);
    String getTransmissionType();
}




