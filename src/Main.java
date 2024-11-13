import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("***Welcome to our car rental agency.***");
        System.out.println("Our agency can rent car,motorcycle, and truck!");
        String choice;
        String choice2;
        Scanner scanner = new Scanner(System.in);
        boolean runtime=true;
        do {
            System.out.println("Which type of vehicles do you want to rent.");
            System.out.println(" 1-Car \n 2-Motorcycle \n 3-Truck \n 4-Exist");
            int CustomerChoice = scanner.nextInt();


            switch (CustomerChoice) {
                case (1):
                    //Cars
                    System.out.println("Car Details");
                    scanner.nextLine();
                    System.out.println("Make in: ");
                    String CarMakeIn= scanner.nextLine();


                    System.out.println("Model: ");
                    String CarModel= scanner.nextLine();


                    System.out.println("Manufacture: ");
                    String CarManufactureYear=scanner.nextLine();
                    int intCarManufactureYear = Integer.parseInt(CarManufactureYear);


                    System.out.println("Number of doors: ");
                    String CarNumOfDoors = scanner.nextLine();
                    int CarNumberOfDoors = Integer.parseInt(CarNumOfDoors);


                    System.out.println("Fuel Type: (petrol, diesel, or electric) ");
                    String CarFuelType= scanner.nextLine();




                    Cars C = new Cars(CarMakeIn,CarModel,intCarManufactureYear);
                    System.out.println("Make In: "+ CarMakeIn + "\nModel: "+CarModel+ "\nManufacture: "+ intCarManufactureYear);
                    Cars No = new Cars(CarNumberOfDoors,CarFuelType);
                    System.out.println("Number of doors: "+ No.getNumberOfTheDoor());
                    System.out.println("Fuel Type: "+ No.getFuelType());
                    break;


                case (2):
                    //motorcycle
                    System.out.println("MotorCycle Details");
                    scanner.nextLine();
                    System.out.println("Make in: ");
                    String MotorMakeIn= scanner.nextLine();


                    System.out.println("Model: ");
                    String MotorModel= scanner.nextLine();


                    System.out.println("Manufacture: ");
                    String MotorManufactureYear=scanner.nextLine();
                    int intMotorManufactureYear = Integer.parseInt(MotorManufactureYear);


                    System.out.println("Number of Wheels: ");
                    String MotorNumOfWheels = scanner.nextLine();
                    int MotorNumberOfTheWheel = Integer.parseInt(MotorNumOfWheels);


                    System.out.println("Type of Motorcycle: (sport,cruiser,or off-road) ");
                    String MotorTypeOfTheMotorcycle = scanner.nextLine();




                    Motorcycles M = new Motorcycles (MotorMakeIn,MotorModel,intMotorManufactureYear);
                    System.out.println("Make in: "+ MotorMakeIn+ "\nModel: "+ MotorModel + "\nManufacture: "+ intMotorManufactureYear);
                    Motorcycles No2 = new Motorcycles(MotorNumberOfTheWheel,MotorTypeOfTheMotorcycle);
                    System.out.println("Number of Wheels: "+ No2.getNumberOfTheWheel());
                    System.out.println("Type of motorcycle: " + No2.getTypeOfTheMotorcycle());
                    break;

                case (3):
                    // Truck
                    System.out.println("Truck Details");
                    scanner.nextLine();
                    System.out.println("Make in: ");
                    String TruckMakeIn= scanner.nextLine();


                    System.out.println("Model: ");
                    String TruckModel= scanner.nextLine();


                    System.out.println("Manufacture: ");
                    String TruckManufactureYear=scanner.nextLine();
                    int intTruckManufactureYear=Integer.parseInt(TruckManufactureYear);


                    System.out.println("Truck of capacity: (in tons) ");
                    String TruckCapacity = scanner.nextLine();
                    int TruckOfCapacity = Integer.parseInt(TruckCapacity);


                    System.out.println("Transmission type: (manual or automatic)");
                    String TruckTransmission = scanner.nextLine();




                    Trucks T = new Trucks(TruckMakeIn,TruckModel,intTruckManufactureYear);
                    System.out.println("Make in: "+ TruckMakeIn+ "\nModel: "+ TruckModel+ "\nManufacture " + intTruckManufactureYear);
                    Trucks No3 = new Trucks(TruckOfCapacity,TruckTransmission);
                    System.out.println("Capacity: "+ No3.getTheCargoCapacity()+" Tons.");
                    System.out.println("Transmission type: "+ No3.getTransmissionType());
                    break;

                case (4):
                    System.out.println("***Thanks for your time***");
                    break;
                default:
                    System.out.println("Something is wrong please correct your choice!");
            }


            System.out.println("Do you want to create another vehicle? (Yes/No)");
            choice2 = scanner.next();
            runtime = choice2.equalsIgnoreCase("Yes");
        }  while ( runtime);
        System.out.println("Thanks for coming and we hope to see you again soon");
        scanner.close();
    }
}


