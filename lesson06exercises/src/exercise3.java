import java.util.Scanner;

public class exercise3 {

    public static void main(String[] args) {
        String firstPlayer;
        int player1attack;
        String secondPlayer;
        int player2attack;

        Scanner user1 = new Scanner(System.in);
        Scanner user2 = new Scanner(System.in);
        Scanner user1attack = new Scanner(System.in);
        Scanner user2attack = new Scanner(System.in);
        System.out.println("Please Enter the name of the first player: ");
        firstPlayer = user1.next();
        System.out.println("Please Enter the name of the second player: ");
        secondPlayer = user2.next();
        System.out.println("Hi "+firstPlayer+"! Please choose (1 - rock, 2 - scissors, or 3 - paper):");
        player1attack = user1attack.nextInt();
        System.out.println("Hi "+secondPlayer+"! Please choose (1 - rock, 2 - scissors, or 3 - paper):");
        player2attack = user2attack.nextInt();

        if (player1attack == player2attack){
            System.out.println("It's a tie!"); }
        else if (player1attack < player2attack){
            System.out.println(firstPlayer+" Wins!"); }
        else { System.out.println(secondPlayer+" Wins!"); }
    }
}
