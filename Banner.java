/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
    }

    /* Prints a decorative banner, resized to fit the message*/
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

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("The banner works!");
        myBanner.display();
    }

}
