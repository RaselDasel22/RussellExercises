package Exercise10;
import Exercise10.Circle;
import java.util.Scanner;



public class CircleApp
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        Circle Radius = new Circle();

        System.out.print("Please enter the radius: ");
        int InputRadius = user.nextInt();
        Radius.setRadius(InputRadius);

        System.out.println("The circumference is: " + Radius.circumference());
        System.out.println("The diameter is: " + Radius.diameter());

    }


}
