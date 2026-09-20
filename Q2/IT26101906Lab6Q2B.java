import java.util.Scanner;

public class IT26101906Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;
        String result = "";

        System.out.println("Please enter 10 numbers:");

        while (i <= 10) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            result = result + number + " ";
            i++;
        }

        System.out.println("The numbers you entered are:\n" + result);
        input.close();
    }
}