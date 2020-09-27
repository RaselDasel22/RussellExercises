
package Exercise1;
import java.util.Scanner;

public class PickTwoCards {

    public static void main(String[] args) {

        Scanner firstCard = new Scanner(System.in);
        System.out.println("Please enter the suit of the first card (s - spades, h - hearts, d - diamonds, or c - clubs)");
        char suit1 = firstCard.next().charAt(0);
        int rank1 = (int)(Math.random() * 13) + 1;
        Card card1 = new Card(suit1, rank1);


        Scanner secondCard = new Scanner(System.in);
        System.out.println("Please enter the suit of the second card (s - spades, h - hearts, d - diamonds, or c - clubs)");
        char suit2 = secondCard.next().charAt(0);
        int rank2 = (int)(Math.random() * 13) + 1;
        Card card2 = new Card(suit2, rank2);

        System.out.println("First card is " + card1);
        System.out.println("Second card is " + card2);
        if (rank1 > rank2){System.out.println("First card is higher of rank.");}
        else if (rank1 < rank2){System.out.println("Second card is higher of rank");}
        else {System.out.println("Cards are same of rank.");}
    }
}
