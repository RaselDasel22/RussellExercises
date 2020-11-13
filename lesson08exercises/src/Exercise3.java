import java.util.Scanner;
public class Exercise3 {
    static int playerPick;
    static int computerPick;
    public static void main(String[] args) {
        String[] choices = {"none","rock", "scissor", "paper"};

        Scanner user = new Scanner(System.in);
        System.out.println("Please Enter player name: ");
        String player = user.next();
        System.out.println("Hi " + player + "! Please choose (1 - rock, 2 - scissors, or 3 - paper):");
        playerPick = user.nextInt();
        computerPick = (int) (Math.random() * 3) + 1;

        while (!((playerPick==1 && computerPick==2)
                || (playerPick==2 && computerPick==3)
                || (playerPick==3 && computerPick==1))){
            System.out.println("Computer pick " +choices[computerPick]+ ", You pick "+choices[playerPick]
                    + ". Try Again!");
            System.out.println("Hi " + player + "! Please choose again (1 - rock, 2 - scissors, or 3 - paper):");
            playerPick = user.nextInt();
            computerPick = (int) (Math.random() * 3) + 1;
        }
        System.out.println("Computer pick " +choices[computerPick]+ ", You pick "+choices[playerPick]
                + ". You win!");
    }
}
