import java.util.Scanner;

public class CreateSpaServices
{
    public static void main(String[] args)
    {
     String Service;
     double Price;
     SpaServices firstService = new SpaServices();
     SpaServices secondService = new SpaServices();
     Scanner keyboard = new Scanner(System.in);

     System.out.print("Enter Service >> ");
     Service = keyboard.nextLine();
     System.out.print("Enter Price >> ");
     Price = keyboard.nextDouble();

     firstService.setServiceDescription(Service);
     firstService.setPrice(Price);

     keyboard.nextLine();
        System.out.print("Enter Service >> ");
        Service = keyboard.nextLine();
        System.out.print("Enter Price >> ");
        Price = keyboard.nextDouble();

        secondService.setServiceDescription(Service);
        secondService.setPrice(Price);

        System.out.println("First service details:");
        System.out.println(firstService.getServiceDescription() +
                " $" + firstService.getPrice());

        System.out.println("Second service details:");
        System.out.println(secondService.getServiceDescription() +
                " $" + secondService.getPrice());
    }
}
