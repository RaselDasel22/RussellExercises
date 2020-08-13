import java.util.Scanner;

public class Exercise9
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

        addition();
        subtraction();
        multiplication();
        division();
    }

    public static void addition() { System.out.println("Addition result is: " + (firstInteger + secondInteger)); }
    public static void subtraction() { System.out.println("Subtraction result is: " + (firstInteger - secondInteger)); }
    public static void multiplication() { System.out.println("Multiplication result is: " + (firstInteger * secondInteger)); }
    public static void division()
    {
        System.out.println("Division result is: " + (firstInteger / secondInteger));
    }


}
