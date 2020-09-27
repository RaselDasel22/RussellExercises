package Exercise2;

import java.util.Scanner;

public class PickTwoCards {
    public static void main(String[] args) {

        char suit1;
        int randomsuit1 = (int)(Math.random() * 4) + 1;
        int rank1 = (int)(Math.random() * 13) + 1;
        if (randomsuit1 == 1){suit1='s';}
        else if (randomsuit1 == 2){suit1='h';}
        else if (randomsuit1 == 3) {suit1='d';}
        else {suit1='c';}
        Card card1 = new Card(suit1,rank1);

        char suit2;
        int randomsuit2 = (int)(Math.random() * 4) + 1;
        int rank2 = (int)(Math.random() * 13) + 1;
        if (randomsuit2 == 1){suit2='s';}
        else if (randomsuit2 == 2){suit2='h';}
        else if (randomsuit2 == 3) {suit2='d';}
        else {suit2='c';}
        Card card2 = new Card(suit2,rank2);

        System.out.println("First card is " + card1);
        System.out.println("Second card is " + card2);
        if (rank1 > rank2){System.out.println("First card is higher of rank.");}
        else if (rank1 < rank2){System.out.println("Second card is higher of rank");}
        else {System.out.println("Cards are same of rank.");}
    }
}
