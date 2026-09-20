import java.util.Scanner;

public class IT26101906Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        String numbers = "";

        System.out.println("Please enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            sum += num;                 // running total
            numbers += num + " ";       // build the list as text
        }

        double average = sum / 10.0;    // 10.0 keeps the decimal part

        System.out.println();
        System.out.println("The numbers you entered are:");
        System.out.println(numbers.trim());

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}