import java.util.Scanner;
public class CountsByAnything {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Please Enter the interval of counting: ");
        int countBy = user.nextInt();
        for (int number = countBy; number<=500; number=number+countBy){
            if (number%(countBy*10)==0)
                System.out.println(number);
            else System.out.print(number+", ");

        }
    }
}
