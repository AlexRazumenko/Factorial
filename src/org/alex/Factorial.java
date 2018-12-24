package org.alex;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int f;
        int count;

        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the factorial (n!) : ");

                count = 1;
                f = scanner.nextInt();
                if ((f > 0) && (f < 2001)) break;
                else
                    System.out.println("Wrong number! Must be from 1 to 2000!");

            } catch (NumberFormatException | NoSuchElementException e) {
                System.out.println("Wrong data! Please try again.");
            }
        }

        while (f >= 1) {
                int c = Math.floorMod(f, count);
                f /= count;

                if (c != 0) {
                    System.out.println("Given value is not factorial!");
                    break;
                } else if (f == 1) {
                    System.out.println("The value of n is: " + count);
                    break;
                }
                count++;
        }
    }
}
