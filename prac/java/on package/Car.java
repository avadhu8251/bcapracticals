package vehicles;
public class Car implements Vehicle
{
        public void run()
        {
                System.out.println("Car is running.");
        }
        public void speed()
        {
                System.out.println("Speed of Car: 50 Km/h");
        }
        public static void main(String args[])
        {
                Car Car = new Car();
                Car.run();
                Car.speed();
                System.out.println("Your Speed");
        }
}