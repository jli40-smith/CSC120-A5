/**
 * An ASCII art pumpkin which can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
public class Pumpkin {
    
/**
* Prints ASCII art depicting a pumpkin to the console
*/
    public void display() {

        System.out.println("              ___");
        System.out.println("           ___)__|_");
        System.out.println("      .-*'          '*-,");
        System.out.println("     /      /|   |\\     \\ ");
        System.out.println("    ;      /_|   |_\\     ;");
        System.out.println("    ;   |\\           /|  ;");
        System.out.println("    ;   | ''--...--'' |  ;");
        System.out.println("     \\  ''---.....--''  /");
        System.out.println("      ''*-.,_______,.-*'  ");  

    }

/**
 * Main method for testing the display of the pumpkin
 * 
 * @param args String array for command-line arguments
 */
    public static void main(String[] args) {
        Pumpkin myPumpkin = new Pumpkin();
        myPumpkin.display();
    }

}
