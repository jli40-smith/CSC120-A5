/**
 * Creates a resizable ASCII art banner with a message that can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
public class Banner {
    private String message;

/**
 *  Creates a Banner object which resizes to fit the specified message
 * @param m String message that is contained in banner
 */
    public Banner(String m) {
        this.message = m;
    }

/**
 * Prints the banner to the console
 */
    public void display() {
        int msgLength = this.message.length(); //Source [1]

        String resizableAsterisks = "*".repeat(msgLength);
        String resizableTildes = "~".repeat(msgLength);
        String resizableWhiteSpaces = " ".repeat(msgLength + 10); 

        System.out.println("            ***" + resizableAsterisks +"***");
        System.out.println("          *** ~~" + resizableTildes + "~ ***");
        System.out.println("         *** ~  " + this.message + " ~ ***");
        System.out.println("          *** ~~" + resizableTildes + "~ ***");
        System.out.println("            ***" + resizableAsterisks +"***");
        System.out.println(resizableWhiteSpaces + "*******");
        System.out.println(resizableWhiteSpaces + "  ***");
        System.out.println(resizableWhiteSpaces + " **");
        System.out.println(resizableWhiteSpaces + "*");

    }

/**
 * Main method for testing the display of the banner 
 * @param args String array for command-line arguments
 */
    public static void main(String[] args) {
        Banner myBanner = new Banner("The banner works!");
        myBanner.display();
    }

}
