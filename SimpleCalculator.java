package Sapient_JavaEssentials;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number/numeric value: ");
        String input1 = sc.nextLine();
        double d1 = Double.parseDouble(input1);
        System.out.println("Enter the second number/numeric value: ");
        String input2 = sc.nextLine();
        double d2 = Double.parseDouble(input2);
        double result = d1 + d2;
        System.out.println("The Output: " + result);
    }

}
