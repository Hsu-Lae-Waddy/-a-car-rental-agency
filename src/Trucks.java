import TruckVehicle.TruckVehicle;


public class Trucks implements TruckVehicle {
    private String MakeIn;
    private String Model;
    private int TheManufactureYear;
    private int TheCargoCapacity;
    private String TransmissionType;


    public Trucks(String MakeIn, String Model, int TheManufactureYear){
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
    public void setTheCargoCapacity(int theCargoCapacity) {
        TheCargoCapacity = theCargoCapacity;
    }


    @Override
    public int getTheCargoCapacity() {
        return TheCargoCapacity;
    }


    @Override
    public void setTransmissionType(String transmissionType) {
        TransmissionType = transmissionType;
    }


    @Override
    public String getTransmissionType() {
        return TransmissionType;
    }


    public Trucks(int TheCargoCapacity,String TransmissionType) {
        this.TheCargoCapacity=TheCargoCapacity;
        this.TransmissionType=TransmissionType;
    }
}
