import CarVehicle.CarVehicle;


public class Cars implements CarVehicle {
    private String MakeIn;
    private String Model;
    private int TheManufactureYear;
    private int NumberOfTheDoor;
    private String FuelType;


    public Cars(String MakeIn,String Model,int TheManufactureYear){
        this.MakeIn=MakeIn;
        this.Model=Model;
        this.TheManufactureYear=TheManufactureYear;
    }


    @Override
    public String getMakeIn() {
        return MakeIn;
    }


    @Override
    public String getModel() {
        return Model;
    }


    @Override
    public int getTheManufactureYear() {
        return TheManufactureYear;
    }


    @Override
    public void setNumberOfTheDoor(int numberOfTheDoor) {
        NumberOfTheDoor = numberOfTheDoor;
    }


    @Override
    public int getNumberOfTheDoor() {
        return NumberOfTheDoor;
    }


    @Override
    public void setFuelType(String fuelType) {
        FuelType = fuelType;
    }


    @Override
    public String getFuelType() {
        return FuelType;
    }
    public Cars(int NumberOfTheDoor,String FuelType){
        this.NumberOfTheDoor=NumberOfTheDoor;
        this.FuelType=FuelType;
    }
}
