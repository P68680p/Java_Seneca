/*      Problem:	Write a	program	that prompts the user to enter two	positive integers and finds	their
	    greatest common	divisor.

        Solution: 	Suppose	you	enter two integers 4 and 2, their greatest common divisor is 2.
        Suppose	you	enter two integers 16 and 24, their greatest common	divisor is	8.	So,	how	do you find
        the	greatest common	divisor?
        Let	the	two	input integers be n1 and n2. You know number 1 is a	common divisor,	but	it	may	not	be the
        greatest common divisor. So you can check whether k (for k	= 2, 3,	4,	and	so on) is a common
        divisor	for	n1 and n2, until k is greater than n1 or n2.    */

import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {

        System.out.println("Please enter your 1st positive number:");
        Scanner input1 = new Scanner(System.in);
        int num1 = input1.nextInt();

        System.out.println("Please enter your 2nd positive number:");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();

        int greatestCommonDivizor = 1;

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("You entered negative number or zero, try enter again.");
        } else {
            // finding the greatest common divisor
            for (int i = 2; i <= num1 || i <= num2; i++) {
                if (num1 % i == 0 & num2 % i == 0) {
                    greatestCommonDivizor = i;
                }
            }
            System.out.println("The greatest common divizor for numbers " + num1 + " and " + num2 + " is " + greatestCommonDivizor);
        }
    }
}
