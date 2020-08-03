
import java.util.Scanner;

public class exercise2_4 {

    final static char MAPUTI = 'w';
    final static char MORENO = 'y';
    final static char MAITIM = 'b';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the color of your skin? w = White, y = Yellow, b = Brown : ");
        char color = scanner.nextLine().toLowerCase().charAt(0);

        //TODO FIX OUTPUT, use boolean expression

        System.out.println("Maputi ba? " + (MAPUTI == color));

        //TODO FIX OUTPUT, use boolean expression

        System.out.println("Moreno ba? " + (MORENO == color));

        //TODO FIX OUTPUT, use boolean expression

        System.out.println("Maitim ba? " + (MAITIM == color));
    }


    /**
     * Expectations
     * 1. Kapag 'w'
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? true
     * Moreno ba? false
     * Maitim ba? false
     *
     *
     * 2. Kapag 'y'
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? false
     * Moreno ba? true
     * Maitim ba? false
     *
     *
     * 3. Kapag 'b' or iba pa
     * What is the color of your skin? w = White, y = Yellow, b = Brown : w
     *
     * Maputi ba? false
     * Moreno ba? false
     * Maitim ba? true
     */
}
