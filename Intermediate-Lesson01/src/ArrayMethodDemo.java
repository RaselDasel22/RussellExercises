import java.util.Scanner;

public class ArrayMethodDemo {
    static int[] userInput= new int[3];
    static int userChose;


    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        int inputNum = 1;
        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Please enter number " + inputNum + ": ");
            userInput[i] = user.nextInt();
            inputNum++;
        }
        System.out.print("(1) Display all the integers."+
                "\n(2) Display all the integers in reverse order."+
                "\n(3) Display the sum of the integers."+
                "\n(4) Display all values less than the average."+
                "\n(5) Display all values that are higher than the calculated average value."+
                "\n(6) Exit."+
                "\nPlease choose from 1-6: ");
        userChose = user.nextInt();
        if (userChose==1){
            displayAll();
        }
        else if (userChose==2){
            displayReverse();
        }
        else if (userChose==3){
            sum();
        }
        else if (userChose==4){
            lowerThanAverage();
        }
        else if (userChose==5){
            higherThanAverage();
        }
        else System.exit(0);

    }

    static void displayAll(){
        for (int i = 0; i < userInput.length; i++){
            System.out.println(userInput[i]);
        }
    }

    static void displayReverse(){
        for (int lastNum = 2; lastNum>=0; lastNum--) {
            System.out.println(userInput[lastNum]);
        }
    }

    static void sum(){
        int sum = 0;
        for (int i=0; i<userInput.length; i++){
            sum = sum + userInput[i];
        }
        System.out.println("The sum of the integers is "+sum);
    }


    static void lowerThanAverage(){
        int sum = 0;
        int inputNum=1;
        for (int i=0; i<userInput.length; i++){
            sum = sum + userInput[i];
        }
        int average = sum/userInput.length;
        System.out.println("Average: " + average);

        for (int i=0; i<userInput.length; i++){
            if (userInput[i]<average)
                System.out.println("Number "+inputNum+": "+userInput[i]);
            inputNum++;
        }

    }

    static void higherThanAverage(){
        int sum = 0;
        int inputNum=1;
        for (int i=0; i<userInput.length; i++){
            sum = sum + userInput[i];
        }
        int average = sum/userInput.length;
        System.out.println("Average: " + average);

        for (int i=0; i<userInput.length; i++){
            if (userInput[i]>average)
                System.out.println("Number "+inputNum+": "+userInput[i]);
            inputNum++;
        }

    }

}
