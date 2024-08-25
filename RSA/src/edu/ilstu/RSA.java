package edu.ilstu;

import java.util.Scanner;
import java.util.Random;

public class RSA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the RSA Encryption!");

        // Read name
        System.out.println("Enter Name: ");
        String name = input.nextLine();

        // Read message as a string and convert to a numerical value
        System.out.println("Hi " + name + ", enter a message to encrypt (as a number): ");
        double M = input.nextDouble();

        // Read public key (e, n)
        System.out.println("Provide a public key (e, n) to encrypt this message: ");
        System.out.print("Enter e: ");
        double E = input.nextDouble();
        System.out.println("Enter N: ");
        double N = input.nextDouble();

        // Generate random number and create Query ID
        Random R = new Random();
        int rand = R.nextInt(400) + 100;
        int L = name.length();
        char lastName = name.charAt(L - 1);
        char firstName = name.charAt(0);
        char middleName = name.charAt(L / 2);
        String Le = String.valueOf(L);
        String Ra = String.valueOf(rand);
        String ID = (Le + lastName + firstName + Ra + middleName);

        // Compute ciphertext
        double C = Math.pow(M, E) % N;

        // Print encryption summary
        System.out.println("*************");
        System.out.println("Encryption summary");
        System.out.println("**************");
        System.out.println("Query ID: " + ID);
        System.out.println("Message (M): " + M);
        System.out.println("Public Key (e, n): (" + E + ", " + N + ")");
        System.out.println("Ciphertext: " + C);
    }
}
