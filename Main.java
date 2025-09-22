import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n\n------------------------ Welcome to Calculator ------------------------\n");
        CalculationTask calculationTask = new CalculationTask();

        while (true) {
            System.out.println("\n\n------------- Choose from these options 1-8 -------------\n");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulus (%)");
            System.out.println("6. Power (a^b)");
            System.out.println("7. Square Root ");
            System.out.println("8. Exit");

            int operation;

            try {
                operation = Integer.parseInt(scan.nextLine()); // safer
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer.");
                continue;
            }

            if (operation == 8) {
                System.out.println("Thanks!! for using this calculator ");
                break;
            }

            else if (operation == 7) {
                System.out.print("Enter number: ");
                double num = scan.nextDouble();
                if (num < 0)
                    System.out.println("For square root number can't be negative!!!");
                else
                    System.out.printf("Square root of %.2f is %.2f\n", num, Math.sqrt(num));
            }

            else {
                System.out.print("Enter first number: ");
                double num1 = scan.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scan.nextDouble();

                switch (operation) {
                    case 1 -> System.out.printf("%.2f + %.2f = %.2f \n", num1, num2, calculationTask.add(num1, num2));
                    case 2 ->
                        System.out.printf("%.2f - %.2f = %.2f \n", num1, num2, calculationTask.subtraction(num1, num2));
                    case 3 -> System.out.printf("%.2f * %.2f = %.2f \n", num1, num2,
                            calculationTask.multiplication(num1, num2));
                    case 4 -> {
                        if (num2 == 0)
                            System.out.println("Denominator can't be negative");
                        else
                            System.out.printf("%.2f / %.2f = %.2f \n", num1, num2,
                                    calculationTask.division(num1, num2));
                    }
                    case 5 ->
                        System.out.printf("%.2f %% %.2f = %.2f \n", num1, num2, calculationTask.modulus(num1, num2));
                    case 6 -> System.out.printf("%.2f ^ %.2f = %.2f \n", num1, num2, calculationTask.power(num1, num2));
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        scan.close();
    }
}