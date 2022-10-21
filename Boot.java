/**
 * Creates an ASCII art boot which can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
public class Boot {
  
    private String direction;
  
/**
 * Creates a Boot object with a specified direction 
 * @param direction String which determines whether the left or right boot will be printed
 */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

/**
 * Prints a Boot to the console
 */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("       (____^_|");
        } else if (this.direction.equals("right")) {
          System.out.println("|_^____)");
        } else {
          System.out.println("Which boot? Do you want \"left\" or \"right?\"");
        }
    }

/**
 * Main method for testing the display of the banner 
 * @param args String array for command-line arguments
 */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        Boot exceptionBoot = new Boot("Amongus"); 
        myLeftBoot.display();
        myRightBoot.display();
        exceptionBoot.display();
    }

}
