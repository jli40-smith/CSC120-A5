import java.util.ArrayList;

/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    // Parts of the Scarecrow
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    //private Boot leftFoot;
    //private Boot rightFoot;
    private Banner sign;
    private String message;

    //Constructor
    public Scarecrow(Pumpkin h, Shirt s, Pants p, Banner b) {
        head = h;
        body = s;
        legs = p;
        sign = b;
    }

    // Displays the Scarecrow 
    public void display() {
        sign.display(); 
        head.display();
        body.display();
        legs.display();
    }



    /* Main method (for testing) */
    public static void main(String[] args) {
        String defaultMessage = "Happy Halloween!"; 
        ArrayList<String> userInput = new ArrayList<String>(); 
        
        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Banner(defaultMessage));
        
        if (args.length > 0) {
            
            for (int i = 0; i < args.length; i++) {
                userInput.add(args[i]); 
            }
            myScarecrow.message = String.join(" ", userInput); 
        }

        myScarecrow.display();
    
    }

}

