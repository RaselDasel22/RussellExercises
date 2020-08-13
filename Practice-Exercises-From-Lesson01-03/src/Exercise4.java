import java.util.Scanner;

public class Exercise4
{
    public static void main(String[] args) {
        int num;
        Scanner user = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        num = user.nextInt();
        String evenORodd = (num % 2) == 0 ? "even" : "odd";
        System.out.println(num + " is an " + evenORodd + " number.");

    }
}
