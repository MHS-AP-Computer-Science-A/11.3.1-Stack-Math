import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /*
            I have done all the input for you. You will need to finish the code
            by filling in all the todos
        */
        // Input the entire line
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        // Scanner to go through the line
        Scanner lineInput = new Scanner(line);

        //Create a Stack with type Integer 
        /* todo */

        // Loop while there are things left to input
        while (lineInput.hasNext()) {
            // Read one input from the line
            String in = lineInput.next();

            /* Process each input:
                - If it is an operator, pop two elements from the stack, perform the operation
                  and push the result back on the stack
                - Otherwise it is an operand, so convert it to an int using Integer.parseInt() 
                  and push it on the stack
            */ 

            /* todo */
        }

        //Print the result of peeking at the top element
        /* todo */

    }

}
