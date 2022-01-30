package Sapient_JavaEssentials;

import java.util.Scanner;

public class ComplexCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numeric Value: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the seconf numeric value: ");
        String s2 = sc.nextLine();
        System.out.println("Choose the operation(+, -, *, /) ");
        String op = sc.nextLine();
        double result = 0;
        try {
            switch (op) {
                case "+":
                    result = addValues(s1, s2);
                    break;
                case "-":
                    result = subtractValues(s1, s2);
                    break;
                case "*":
                    result = multiplyValues(s1, s2);
                    break;
                case "/":
                    result = divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized Operation!");
                    return;
            }
            System.out.println("The answer is " + result);
        } catch (Exception e) {
            System.out.println("Number formating exception: " + e.getMessage());

        }
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return (d1 + d2);
    }

    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;

    }

    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;

    }

    private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;

    }
}
