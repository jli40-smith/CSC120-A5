/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
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

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }

}
