/*      Problem:	Write a	program	that displays the first	50 prime numbers in	five lines,	each of	which contains
        10 numbers.	An integer greater than	1 is prime if its only positive	divisor is 1 or itself.
        For	example, 2,	3, 5, and 7	are	prime numbers, but 4, 6, 8,	and	9 are not.

        Solution:	The	problem	can	be	broken	into	the	following	tasks:
        • For	number	=	2,	3,	4,	5,	6,	...,	test	whether	the	number	is prime.
        • Determine	whether	a	given	number	is	prime.
        • Count	the	prime	numbers.
        • Print	each prime number, and print 10	numbers	per	line.       */

public class Problem3 {

    public static void main(String[] args) {
        //create an array for storing of 50 first prime numbers
        int[] arrayPrimeNumbers = new int[50];

        //initialization for first prime element = 2;
        int nextNumber = 2;                         //prime number in arrayPrimeNumbers
        int indexNextNumber = 0;                    //index nextNumber in arrayPrimeNumbers
        arrayPrimeNumbers[indexNextNumber] = nextNumber;
        int stop = 1;                               //condition for stopping when we find 50 prime numbers. It's = 1 because we already set 0 element of array

        int count;                                  //counter for numbers from division without remainder
        while (stop < arrayPrimeNumbers.length) {
            count = 0;
            nextNumber++;

            // Find prime number, if count >0 then it is NOT prime number, otherwise is prime number
            for (int i = 2; i < nextNumber / 2 + 1; i++) {
                if (nextNumber % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                stop++;
                indexNextNumber++;
                arrayPrimeNumbers[indexNextNumber] = nextNumber;

            }
        }

        //print array in 5 lines, 10 numbers per line
        for (int i = 0; i < arrayPrimeNumbers.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(arrayPrimeNumbers[i] + " ");
        }


        System.out.println();
    }
}
