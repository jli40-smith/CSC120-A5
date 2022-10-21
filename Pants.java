/**
 * Creates a pair of ASCII art pants which can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
public class Pants {

/**
* Prints ASCII art depicting a pair of pants to the console
*/
    public void display() {

        System.out.println("        |   | \\/  |  |");
        System.out.println("        |__/  ||  \\__|");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |     ||     |");
        System.out.println("        |__=__||__=__|");

    }

/**
 * Main method for testing the display of the pants
 * @param args String array for command-line arguments
 */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }

}
