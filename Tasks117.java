import java.util.Scanner;

public class Tasks117 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float num1 = input.nextFloat();
        
        System.out.print("Enter the second number: ");
        float num2 = input.nextFloat();
        
        System.out.print("Enter the third number: ");
        float num3 = input.nextFloat();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else {
            float largest;
            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
            } else {
                largest = num3;
            }

            System.out.println("The largest number is: " + largest);
        }

        input.close();
    }
}


