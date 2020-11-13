import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Please give number: ");
        int userNumber = user.nextInt();
        int number = 1;

        while (number <= userNumber){
            System.out.println(number);
            number++;
        }
    }
}
