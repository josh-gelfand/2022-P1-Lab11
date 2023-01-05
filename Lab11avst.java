// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst {
    public static void main(String[] args) {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the primes upper bound ===>  ");
        final int MAX = input.nextInt();
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        for (int num = 2; num < primes.length; num++) {
            primes[num] = true;
        }
        System.out.println("\nCOMPUTING PRIME NUMBERS");
        for (int index = 2; index < primes.length; index++) {
            for (int num = 2 * index; num < primes.length; num += index) {
                primes[num] = false;
            }
        }
    }

    public static void displayPrimes(boolean primes[]) {
        System.out.println("\n\nPRIMES BETWEEN 1 AND " + primes.length);
        System.out.println();

        for (int num = 2; num < primes.length; num++) {
            if (primes[num] == true) {
                System.out.print(num + " " + "\n");


            }

        }
    }
}

