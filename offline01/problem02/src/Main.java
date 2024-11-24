import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter your continental location:");
        String s = sc.next() ;
        CarFactory cf = new CarFactory() ;
        Car car = cf.getCar(s) ;
        if(car == null){
            System.out.println("No car for your location");
        }
        else {
            System.out.println("Car for your location is:");
            System.out.println("Name : " + car.name());
            System.out.println("Color: " + car.color());
            System.out.println("Manufacturing country: " + car.manufacturingCountry());
            System.out.println("Engine : " + car.engine());
            System.out.println("Drivetrain : " + car.driveTrain());
        }
    }
}
