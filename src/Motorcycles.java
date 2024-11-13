import MotorcycleVehicle.MotorcycleVehicle;


public class Motorcycles implements MotorcycleVehicle {
    private String MakeIn;
    private String Model;
    private int TheManufactureYear;
    private int NumberOfTheWheel;
    private String TypeOfTheMotorcycle;


    public Motorcycles(String MakeIn,String Model, int TheManufactureYear) {
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
    public void setNumberOfTheWheel(int numberOfTheWheel) {
        NumberOfTheWheel = numberOfTheWheel;
    }


    @Override
    public int getNumberOfTheWheel() {
        return NumberOfTheWheel;
    }


    @Override
    public void setTypeOfTheMotorcycle(String typeOfTheMotorcycle) {
        TypeOfTheMotorcycle = typeOfTheMotorcycle;
    }


    @Override
    public String getTypeOfTheMotorcycle() {
        return TypeOfTheMotorcycle;
    }
    public Motorcycles(int NumberOfTheWheel,String TypeOfTheMotorcycle){
        this.NumberOfTheWheel= NumberOfTheWheel;
        this.TypeOfTheMotorcycle= TypeOfTheMotorcycle;
    }
}
