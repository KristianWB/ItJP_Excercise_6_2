import java.util.Scanner;

public class SumTheDigitsInAnInteger {
    public static void main(String [] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 single digit numbers: ");
        long n = input.nextLong();

        System.out.println("The sum of the three digits are: " + Methods.sumDigits(n));

    }
}
