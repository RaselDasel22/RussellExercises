import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int suit;
        System.out.println("1 - Heart\n" +
                "2 - Spade\n" +
                "3 - Club\n" +
                "4 - Diamond\n" +
                "Please choose Card Suit via a number above: " );
        suit = user.nextInt();
        switch (suit){
            case 1:
                System.out.println("You selected Heart!");
                break;
            case 2:
                System.out.println("You selected Spade!");
                break;
            case 3:
                System.out.println("You selected Club!");
                break;
            case 4:
                System.out.println("You selected Diamond!");
                break;
        }
    }


}
