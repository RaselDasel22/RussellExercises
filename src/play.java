
import java.util.Scanner;
import javax.swing.JOptionPane;

public class play {

    final static String MAPUTI = "w";
    final static String MORENO = "y";
    final static String MAITIM = "b"; //dinagdag ko to

    public static void main(String[] args) {

        System.out.print("What is the color of your skin? w = White, y = Yellow, b = Brown : ");
        String color = JOptionPane.showInputDialog(null,"\"What is the color of your skin? w = White, y = Yellow, b = Brown : \""); //dinagdag ko ung .toLowerCase()
        boolean skinColor; //dinagdag ko to


        //TODO FIX OUTPUT, use boolean expression

        if(color == MAPUTI)
            skinColor = true;
        else skinColor = false;
        JOptionPane.showMessageDialog(null,"Maputi ba? "+ skinColor);
        System.out.println("Maputi ba? " + skinColor);


        //TODO FIX OUTPUT, use boolean expression


        if(color == MORENO)
            skinColor = true;
        else skinColor = false;
        System.out.println("Moreno ba? " + skinColor);

        //TODO FIX OUTPUT, use boolean expression

        if (color == MAITIM)
            skinColor = true;
        else skinColor = false;
        System.out.println("Maitim ba? " + skinColor);
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
