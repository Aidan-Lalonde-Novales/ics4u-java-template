/*
* This program finds the length of a board foot
* given width and height
*
* @author  Aidan Lalonde-Novales
* @version 1.0
* @since   2020-09-25
*/

import java.util.Scanner;

/**
 * This is a board foot length calculator.
*/

final class BoardFootLength {

    /**
    * Constant assigned to 144.
    */
    public static final float BOARD_FOOT = 144;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private BoardFootLength() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * This function calculates the length of a boardfoot.
     *
     * @param width is the width of the wood.
     * @param height is the height of the wood.
     * @return length is the length of the wood.
     */
    public static float lengthCalculation(
        final float width, final float height) {
        final float length = BOARD_FOOT / (width * height);
        return length;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        System.out.println(
            "This program calculates the required length for a board foot."
        );

        try {
            // Input (width)
            final Scanner widthObject = new Scanner(System.in);
            System.out.println("\nEnter the width of the wood (in): ");
            final float width = widthObject.nextFloat();

            // Input (height)
            final Scanner heightObject = new Scanner(System.in);
            System.out.println("Enter the height of the wood (in): ");
            final float height = heightObject.nextFloat();

            // Process
            final float length = lengthCalculation(width, height);

            // Output
            System.out.printf("\nYour wood length should be " + length
                                + " inch(es) long.");

        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input.");
        }

        System.out.println("");
        System.out.println("\nDone.");
    }
}
