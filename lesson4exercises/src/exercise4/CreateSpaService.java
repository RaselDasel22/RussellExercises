package exercise4;

import java.util.Scanner;

public class CreateSpaService {
    public static void main(String[] args)
    {
        String Service;
        double Price;
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Service >> ");
        Service = keyboard.nextLine();
        System.out.print("Enter Price >> ");
        Price = keyboard.nextDouble();

        firstService.setServiceDescription(Service);
        firstService.setPrice(Price);

        //keyboard.nextLine();
        //System.out.print("Enter Service >> ");
        //Service = keyboard.nextLine();
        //System.out.print("Enter Price >> ");
        //Price = keyboard.nextDouble();

        //secondService.setServiceDescription(Service);
        //secondService.setPrice(Price);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() +
                " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() +
                " $" + secondService.getPrice());
    }
}
