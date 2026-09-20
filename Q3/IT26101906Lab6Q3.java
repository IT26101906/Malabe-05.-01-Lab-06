import java.util.Scanner;

public class IT26101906Lab6Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfSquares = 0;   
        int count = 0;          
        int number;

        System.out.println("Enter positive integers (terminate input with -99):");

        while (true) {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            if (number == -99) {
                break;                      
            }

            if (number < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;                   
            }

            sumOfSquares += number * number;
            count++;
        }

        System.out.println();

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }

        input.close();
    }
}