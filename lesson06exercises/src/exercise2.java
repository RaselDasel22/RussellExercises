import java.util.Scanner;

public class exercise2 {
    final static int min = 1;
    final static int max = 100;

    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess = user.nextInt();
        // generate random numbers within 1 to 100
        int random = (int)(Math.random() * max) + min;
        System.out.println("The number is: " + random);
        if (guess == random){
            System.out.println("Your guess is correct!");
        }
        else if (guess > random){
            System.out.println("Your guess is higher!");
        }
        else {
            System.out.println("Your guess is lower!");
        }


    }
}
