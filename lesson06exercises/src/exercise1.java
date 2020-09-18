import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int num;
        Scanner user = new Scanner(System.in);
        System.out.print("Please Enter an Integer: ");
        num = user.nextInt();
        if ((num % 2) == 0){
            System.out.println(num + " is an even number");}
        else if ((num % 2) == 1){
            System.out.println(num + " is an odd number");
            }

    }
}
