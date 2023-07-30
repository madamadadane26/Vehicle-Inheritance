public class Car extends MotorVehicle {

    public int numberOfWindows = 6;


    public void start()
    {
        running = true;
        System.out.println("Type of vehicle: Car ");
        System.out.println("Number of Windows: " + numberOfWindows);
        System.out.println("Running: " + running);

    }

    public void stop()
    {
        running = false;
        System.out.println("Type of vehicle: Car ");
        System.out.println("Number of Windows: " + numberOfWindows);
        System.out.println("Running: " + running);
    }
}