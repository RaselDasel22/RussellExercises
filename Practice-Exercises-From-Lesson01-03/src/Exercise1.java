import java.util.Scanner;

public class Exercise1
{
    private static int firstInteger;
    private static int secondInteger;
    public static void main(String[] args)
    {

        Scanner num = new Scanner(System.in);
        System.out.print("Please Enter the First Integer: ");
        firstInteger = num.nextInt();
        System.out.print("Please Enter Second Integer: ");
        secondInteger = num.nextInt();


        System.out.println("Addition result is: " + (firstInteger + secondInteger));
        System.out.println("Subtraction result is: " + (firstInteger - secondInteger));
        System.out.println("Multiplication result is: " + (firstInteger * secondInteger));
        System.out.println("Division result is: " + (firstInteger / secondInteger));
    }
}
