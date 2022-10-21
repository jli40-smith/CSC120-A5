/**
* An ASCII art scarecrow with a resizable banner containing a message which can be printed to the console
 * 
 * @author Joanna Li
 * @version 21 October 2022
 */
class Scarecrow {

    // Parts of the Scarecrow
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;

/**
 * Creates a Scarecrow object which includes a resizable banner
 * 
 * @param h Head object making up the pumpkin head of the scarecrow
 * @param s Shirt object making up the body of the scarecrow
 * @param p Pants object making up the legs of the Scarecrow
 * @param b Banner object containing the Scarecrow's message
 * @param lbt Boot object making up the left foot of the scarecrow
 * @param rbt Boot object making up the right foot of the scarecrow
 */
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Banner b, Boot lbt, Boot rbt) {
        head = h;
        body = s;
        legs = p;
        sign = b;
        leftFoot = lbt; 
        rightFoot = rbt; 
    }

/**
 * Prints the banner to the console
 */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

/**
 * Displays the Scarecrow with a custom message from the command line
 * @param args String message command line argument which will be printed with the scarecrow
 */
    public static void main(String[] args) {
        String message;

        if (args.length > 0) {
            message = args[0];
        } else {
            message = "Happy Halloween!";
        }

        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Banner(message), new Boot("left"), new Boot("right"));
        myScarecrow.display();
    }

}

