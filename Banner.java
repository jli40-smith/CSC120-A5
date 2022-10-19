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

    /*
     * TODO: Modify this method to print a decorative banner, resized to fit the message
     */
    public void display() {
        int msgLength = this.message.length();
        String resizableAsterisks = "*".repeat(msgLength);
        String resizableTildes = "~".repeat(msgLength); 

        System.out.println("   ***" + resizableAsterisks +"***");
        System.out.println(" *** ~~" + resizableTildes + "~ ***");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
