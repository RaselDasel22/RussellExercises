import java.util.Scanner;

public class Exercise5
{
    public static void main(String[] args)
    {

    Scanner user = new Scanner(System.in);

        System.out.print("Please enter distance in meter: ");
        float meter = user.nextFloat();
        System.out.print("Please enter hour: ");
        float hours = user.nextFloat();
        System.out.print("Please enter minutes: ");
        float minutes = user.nextFloat();
        System.out.print("Please enter seconds: ");
        float seconds = user.nextFloat();

        float TimeInSeconds = (hours*3600) + (minutes*60) + seconds;
        float mps = meter / TimeInSeconds;
        float kph = ( meter/1000.0f ) / ( TimeInSeconds/3600.0f );
        float mph = (meter/1609f) / ( TimeInSeconds/3600.0f );

        System.out.println("Your Speed in meters/second is " + mps);
        System.out.println("Your Speed in km/h is " + kph);
        System.out.println("Your Speed in miles/h is " + mph);
    }


}
