import java.util.Scanner;

public class VehicleManager
{


    public Motorcycle[] motorcycle = new Motorcycle[3];
    public Car[] car = new Car[3];
    public int selection = 0;

    public void run()
    {
        Motorcycle Enduro = new Motorcycle();
        Enduro.running = false;
        Enduro.vehicleModel = "RPS Hawk Dual Sport 250cc";
        Enduro.hasSidecar = false;
        Enduro.color = "Orange";

        Motorcycle Dirt = new Motorcycle();
        Dirt.running = false;
        Dirt.vehicleModel = "Hodaka Road Toad 100";
        Dirt.hasSidecar = false;
        Dirt.color = "Black";


        Motorcycle Motocross  = new Motorcycle();
        Motocross.running = false;
        Motocross.vehicleModel = "Honda CRF450R";
        Motocross.hasSidecar = true;
        Motocross.color = "Green";


        Car Convertible = new Car();
        Convertible.running = false;
        Convertible.vehicleModel = "Alfa Romeo Spider";
        Convertible.numberOfWindows = 4;
        Convertible.color = "Red";

        Car Coupe = new Car();
        Coupe.running = false;
        Coupe.vehicleModel = "Nissan S15 Silvia";
        Coupe.numberOfWindows = 4;
        Coupe.color = "Blue";

        Car Sports = new Car();
        Sports.running = false;
        Sports.vehicleModel = "Mazda RX-7 FD3S";
        Sports.numberOfWindows = 4;
        Sports.color = "Yellow";


        motorcycle[0] = Enduro;
        motorcycle[1] = Dirt;
        motorcycle[2] = Motocross;

        car[0] = Convertible;
        car[1] = Coupe;
        car[2] = Sports;



        Scanner input = new Scanner(System.in);





        System.out.print("Please choose a car to begin: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.println(c+1);
            System.out.println("Vehicle Model: " + car[c].vehicleModel);
            System.out.println("Vehicle Color: " + car[c].color);
            System.out.println("No. of Windows: " + car[c].numberOfWindows);
            System.out.println("Running " +  car[c].running);
        }

        selection = input.nextInt();

        car[selection-1].start();
        selection--;

        System.out.println("Vehicle Model:" + car[selection].vehicleModel);
        System.out.println("Vehicle Color:" + car[selection].color);
        System.out.println("No. of Windows:" + car[selection].numberOfWindows);
        System.out.println("Running " +  car[selection].running);



        System.out.print("Please choose a motorcycle to begin: >> \n");
        for(int c = 0; c < 3; c++){

            System.out.println(c+1);
            System.out.println("Vehicle Model:" + motorcycle[c].vehicleModel);
            System.out.println("Vehicle Color:" + motorcycle[c].color);
            System.out.println("Sidecar" + motorcycle[c].hasSidecar);
            System.out.println("Running " +  motorcycle[c].running);
        }

        selection = input.nextInt();

        motorcycle[selection-1].start();
        selection--;

        System.out.println("Vehicle Model:" + motorcycle[selection].vehicleModel);
        System.out.println("Vehicle Color:" + motorcycle[selection].color);
        System.out.println("Sidecar" + motorcycle[selection].hasSidecar);
        System.out.println("Running " +  motorcycle[selection].running);



        System.out.println("Please choose a car to quit: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.println(c+1);
            System.out.println("Vehicle Model: " + car[c].vehicleModel);
            System.out.println("Vehicle Color: " + car[c].color);
            System.out.println("No. of Windows: " + car[c].numberOfWindows);
            System.out.println("Running " +  car[c].running);
        }
        selection = input.nextInt();

        car[selection-1].stop();
        selection--;

        System.out.println(car[selection].vehicleModel + " has stopped");



        System.out.println("Please choose a motorcycle to quit: >> \n");
        for(int c = 0; c < 3; c++)
        {
            System.out.println(c+1);
            System.out.println("Vehicle Model:" + motorcycle[c].vehicleModel);
            System.out.println("Vehicle Color:" + motorcycle[c].color);
            System.out.println("Sidecar" + motorcycle[c].hasSidecar);
            System.out.println("Running " +  motorcycle[c].running);
        }
        selection = input.nextInt();

        motorcycle[selection-1].stop();
        selection--;

        System.out.println(motorcycle[selection].vehicleModel + " has stopped.");


        System.out.println("Vehicle statuses: ");

        for(int c = 0; c < 3; c++){
            System.out.println("Car statuses");
            System.out.println(c+1);
            System.out.println(car[c] + " is running.");
        }
        for(int c = 0; c < 3; c++){
            System.out.println("Motorcycle statuses");
            System.out.println(c+1);
            System.out.println(motorcycle[c] + " is running.");
        }





    }




}