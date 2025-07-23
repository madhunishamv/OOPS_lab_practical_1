import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner vote = new Scanner(System.in);

        System.out.println("--Voting Eligibility Checker --");

        // Arithmetic Operators
        System.out.print("Enter your current age: ");
        int age = vote.nextInt();

        System.out.print("Enter years you want to add to age: ");
        int addYears = vote.nextInt();

        int newAge = age + addYears;            // + addition
        int ageDifference = newAge - 18;        // - subtraction
        int doubleAge = newAge * 2;             // * multiplication
        int halfAge = newAge / 2;               // / division
        int remainder = newAge % 2;             // % modulus

        System.out.println("\n Arithmetic Results ");
        System.out.println("Future Age (+): " + newAge);
        System.out.println("Difference from 18 (-): " + ageDifference);
        System.out.println("Double Age (*): " + doubleAge);
        System.out.println("Half Age (/): " + halfAge);
        System.out.println("Remainder when divided by 2 (%): " + remainder);

        // Unary Operators
        System.out.println("\n Unary Results ");
        System.out.println("Current Age++ (Increment): " + (++age));
        System.out.println("Future Age-- (Decrement): " + (--age));

        // Relational Operators
        System.out.println("\n Relational Results ");
        System.out.println("Is your age < 18? " + (age < 18));
        System.out.println("Is your age >= 18? " + (age >= 18));
        System.out.println("Is your age == 18? " + (age == 18));
        System.out.println("Is your age != 18? " + (age != 18));

        // Logical Operators
        System.out.println("\n Logical Results ");
        boolean hasVoterID = true;
        boolean isCitizen = true;

        boolean eligible = (age >= 18) && hasVoterID && isCitizen; // AND
        boolean partiallyEligible = (age >= 18) || hasVoterID;     // OR
        boolean notEligible = !(age >= 18);                        // NOT

        System.out.println("Eligible to vote (AND): " + eligible);
        System.out.println("Partially eligible (OR): " + partiallyEligible);
        System.out.println("Not eligible (!): " + notEligible);

        vote.close();
    }
}
