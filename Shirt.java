/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
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

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }

}
