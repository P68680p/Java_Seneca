/*          • Command line calculator
            • Get one double from user eq 12
            • Get one operation symbol eq +
            • Get one another double from user eq 92
            • User enters = sign and compute the result;
            Bonus:
            User can enter as many numbers and operation symbols as they want.
            Eg:
            enter	number:	5
            enter	opr	:	*
            enter	number	6
            enter	opr:	+
            enter	number:	12
            enter	opr:	=                                               */

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        double result = 0;

        //get first number
        System.out.println("Please enter number:");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();

        boolean b = true;
        while (b) {
            //get operation
            System.out.println("Please enter operation:");
            Scanner input2 = new Scanner(System.in);
            String oper = input2.next();

            //check operation: if it is "=" then stop our loop
            if (oper.equals("=")) {
//                System.out.println("You enter = sign");
                break;
            }

            //get next number
            System.out.println("Please enter number:");
            Scanner input1 = new Scanner(System.in);
            double num1 = input1.nextDouble();

            //check operations for counting
            if (oper.equals("+")) {
                result = num + num1;
                num = result;
            } else if (oper.equals("-")) {
                result = num - num1;
                num = result;
            } else if (oper.equals("*")) {
                result = num * num1;
                num = result;
            } else if (oper.equals("/")) {
                result = num / num1;
                num = result;
            }
        }
        //print result
        System.out.println("You result = " + result);
    }
}
