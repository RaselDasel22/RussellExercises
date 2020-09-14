package exercise3;

import java.util.Scanner;

public class circleApp {
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        circle Radius = new circle();

        System.out.print("Please enter the radius: ");
        int InputRadius = user.nextInt();
        Radius.setRadius(InputRadius);

        System.out.println(Radius);

    }
}
