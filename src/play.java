import java.util.Scanner;
public class play
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
// define the range
        final int min = 1;
        final int max =3;
        final int numero=input.nextInt();
        // generate random numbers within 1 to 100
        int random = (int) (Math.random() * max) + min;

        // Output is different everytime this code is executed
        System.out.println(random);

        String number="Your guess is correct";
        number=(random>numero)?"Your guess is Higher":number;
        number=(random <numero)?"Your guess is Lower":number;
        //String number = (random == numero) ?" Your guess is correct ":
        //((random > numero) ? "Your guess is Lower" : "Your guess is Higher");


        System.out.println(number);
    }
}
