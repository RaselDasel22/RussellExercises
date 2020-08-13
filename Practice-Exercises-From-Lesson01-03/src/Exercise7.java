public class Exercise7
{
    // define the range
    final static int min = 1;
    final static int max = 100;

    public static void main(String[] args)
    {


        // generate random numbers within 1 to 100
        int random = (int)(Math.random() * max) + min;

        // Output is different everytime this code is executed
        System.out.println(random);
    }
}
