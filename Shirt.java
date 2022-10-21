/**
 * An ASCII art shirt that can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
public class Shirt {

/**
* Prints ASCII art depicting a shirt to the console
*/
    public void display() {

        System.out.println("        __,--./|.--,__");
        System.out.println("      .`  \\ \\    / /  `.");
        System.out.println("    .`     \\ |  | /     `."); 
        System.out.println("   /   /\\ --- |/ --- /\\   \\"); 
        System.out.println("  /   / ( \\_/ |0 \\_/ ) \\   \\"); 
        System.out.println(" /===/  \\     |      /  \\===\\"); 
        System.out.println("/___/   /     |0     \\   \\___\\"); 
        System.out.println("        |_____/\\_____|");  

    }

/**
 * Main method for testing the display of the shirt
 *
 * @param args String array for command-line arguments
 */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }

}
