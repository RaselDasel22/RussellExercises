package Exercise2;

public class PickCards {
    public static void main(String[] args) {

        char suit1;
        Card card1;
        int randomsuit1 = (int)(Math.random() * 4) + 1;
        int rank1 = (int)(Math.random() * 13) + 1;
        switch (randomsuit1){
            case 1:
                suit1='s';
                card1 = new Card(suit1,rank1);
                System.out.println("First card is " + card1);
                break;
            case 2:
                suit1='h';
                card1 = new Card(suit1,rank1);
                System.out.println("First card is " + card1);
                break;
            case 3:
                suit1='d';
                card1 = new Card(suit1,rank1);
                System.out.println("First card is " + card1);
                break;
            case 4:
                suit1='c';
                card1 = new Card(suit1,rank1);
                System.out.println("First card is " + card1);
                break;
        }

        char suit2;
        Card card2;
        int randomsuit2 = (int)(Math.random() * 4) + 1;
        int rank2 = (int)(Math.random() * 13) + 1;

        switch (randomsuit2){
            case 1:
                suit2='s';
                card2 = new Card(suit2,rank2);
                System.out.println("Second card is " + card2);
                break;
            case 2:
                suit2='h';
                card2 = new Card(suit2,rank2);
                System.out.println("Second card is " + card2);
                break;
            case 3:
                suit2='d';
                card2 = new Card(suit2,rank2);
                System.out.println("Second card is " + card2);
                break;
            case 4:
                suit2='c';
                card2 = new Card(suit2,rank2);
                System.out.println("Second card is " + card2);
                break;
        }




        if (rank1 > rank2){System.out.println("First card is higher of rank.");}
        else if (rank1 < rank2){System.out.println("Second card is higher of rank");}
        else {System.out.println("Cards are same of rank.");}
    }
}
