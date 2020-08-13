import java.util.Scanner;

public class Exercise3
{
    public static void main(String[] args)
    {
        int num;
        Scanner user = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        num = user.nextInt();
        System.out.println("Is " + num + " even number? " + (num % 2 == 0));
        System.out.println("Is " + num + " odd number? " + (num % 2 == 1));

    }
}
