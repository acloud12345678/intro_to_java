import java.util.Scanner;

public class calculator {
    public static void main (String[] args) {
        // Math operations: +, -, *, /, %
        // Boolean operations: &&, ||, <, >, <=, >=, ==, !=
        
        // Programs will run indefinitely
        while (true) {
            // Passing in an input prompted by console
            Scanner in = new Scanner(System.in);
            // Prompt
            System.out.println("Enter your first value (Enter `Q` to exit): ");
            // Variable that stores value
            String input1 = in.next();
            if (input1.equals("q") || input1.equals("Q")) {
                return;
            }
            // Prompt
            System.out.println("Enter your second value: ");
            // Variable that stores value
            String input2 = in.next();
            // Prompt
            System.out.println("Enter your operation: ");
            // Variable that stores value
            String operation = in.next();
            
            // Gets result and flags for calculations
            double d_result = 0;
            boolean b_result = false;
            boolean d_flag = false;
            boolean b_flag = false;
            
            // Converts a string to an int
            int first = Integer.parseInt(input1);
            int second = Integer.parseInt(input2);
            
            if (operation.equals("+")) {
                d_result = first + second;
                d_flag = true;
            }
            else if (operation.equals("-")) {
                d_result = first - second;
                d_flag = true;
            }
            else if (operation.equals("*")) {
                d_result = first * second;
                d_flag = true;
            }
            else if (operation.equals("/")) {
                d_result = first / second;
                d_flag = true;
            }
            else if (operation.equals("%")) {
                d_result = first % second;
                d_flag = true;
            }
            else if (operation.equals("==")) {
                b_result = first == second;
                b_flag = true;
            }
            else if (operation.equals("<")) {
                b_result = first < second;
                b_flag = true;
            }
            else if (operation.equals(">")) {
                b_result = first > second;
                b_flag = true;
            }
            else if (operation.equals("<=")) {
                b_result = first <= second;
                b_flag = true;
            }
            else if (operation.equals(">=")) {
                b_result = first >= second;
                b_flag = true;
            }
            else if (operation.equals("!=")) {
                b_result = first != second;
                b_flag = true;
            }
    
            System.out.println("\n");
            // System.out.println(first);
            // System.out.println(second);
            // System.out.println(operation);
            if (d_flag == true) {
                System.out.println(d_result);
            }
            else if (b_flag == true) {
                System.out.println(b_result);
            }
            else {
                System.out.println("No work done, calculation error");
            }
            System.out.println("\n");
        }
    }
}

/* 
 \n: newline
 \t: tab
 
 &&: boolean, boolean (Ex. true && true)
*/