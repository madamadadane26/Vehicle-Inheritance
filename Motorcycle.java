public class Motorcycle extends MotorVehicle {

    public boolean hasSidecar = true;


    public void start()
    {
        running = true;
        System.out.println("Type of vehicle: Motorcycle ");
        System.out.println("Sidecar: " + hasSidecar);
        System.out.println("Running " + running);

    }

    public void stop()
    {
        running = false;
        System.out.println("Type of vehicle: Motorcycle ");
        System.out.println("Sidecar: " + hasSidecar);
        System.out.println("Running: " + running);
    }
}
