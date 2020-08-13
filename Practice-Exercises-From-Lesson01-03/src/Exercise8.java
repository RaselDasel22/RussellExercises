import java.util.Scanner;

public class Exercise8
{
    final static int min = 1;
    final static int max = 100;

    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.print("Guess the number: ");
        int guess = user.nextInt();
        // generate random numbers within 1 to 100
        int random = (int)(Math.random() * max) + min;

        String comment;
        comment = guess == random ? "Your guess is correct!" :
                (guess > random ? "Your guess is higher!" : "Your guess is lower!");

        // Output is different everytime this code is executed
        System.out.println("The number is: " + random);

        System.out.print(comment);

    }
}
