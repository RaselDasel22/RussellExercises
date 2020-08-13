import java.util.Scanner;

public class Exercise6
{

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int num = input.nextInt();
        int Square;
        int Cube;
        int FourthPower;
        Square = (num * num);
        System.out.println("Square: " + Square);
        Cube = (num * num * num);
        System.out.println("Cube: " + Cube);
        FourthPower = (num * num * num * num);
        System.out.println("Fourth Power: " + FourthPower);
    }
}
