package CarVehicle;


public interface CarVehicle extends Vehicle {
    void setNumberOfTheDoor(int door);
    int getNumberOfTheDoor();
    void setFuelType(String fuelType);
    String getFuelType();
}




interface Vehicle {
    String getMakeIn();
    String getModel();
    int getTheManufactureYear();
}
