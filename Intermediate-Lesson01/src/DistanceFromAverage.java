import java.util.Arrays;
import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        double[] userInput= new double[15];
        int inputNum = 1;
        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Please enter number " + inputNum + ": ");
            userInput[i] = user.nextDouble();
            inputNum++;
        }

        double sum = 0;
        for (int i=0; i<userInput.length; i++){
            sum = sum + userInput[i];
        }

        double average = sum/userInput.length;
        System.out.println("Average: " + average);

        for (int i=0; i<userInput.length; i++) {
            double distanceFromAverage = average - userInput[i];
            System.out.println(userInput[i] + ", " + distanceFromAverage);
        }
    }

}
