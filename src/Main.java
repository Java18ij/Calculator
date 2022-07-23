import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("-+-+-+-+-+-+-+-+-+-+Calculator+-+-+-+-+-+-+-+-+-+-+");
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Operation: ");
        System.out.println("1) Addition");
        System.out.println("2) Subtraction");
        System.out.println("3) Multiplication");
        System.out.println("4) Division");
        System.out.println("5) Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice == 5){
            break;
        }
        if (choice == 1){
            System.out.println("Please enter first number: ");
            int first_addition = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int second_addition = scanner.nextInt();
            int final_addition = first_addition + second_addition;
            System.out.println("Final result: " + final_addition);

        } else if (choice == 2){
            System.out.println("Please enter first number: ");
            int first_subtraction = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int second_subtraction = scanner.nextInt();
            int final_subtraction = first_subtraction - second_subtraction;
            System.out.println("Final result: " + final_subtraction);
        }

        else if(choice == 3){
            System.out.println("Please enter first number: ");
            int first_subtraction = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int second_subtraction = scanner.nextInt();
            int final_subtraction = first_subtraction * second_subtraction;
            System.out.println("Final result: " + final_subtraction);
        }

        else if (choice == 4){
            System.out.println("Please enter first number: ");
            int first_divide = scanner.nextInt();
            System.out.println("Please enter second number: ");
            int second_divide = scanner.nextInt();
            if (second_divide == 0) {
                System.out.println("can't divide by zero");
            }
                int final_multiplication = first_divide / second_divide;
                System.out.println("Final result: " + final_multiplication);
      } else {
        System.out.println("Error");
            }
       }
            System.out.println("Program is complete");
    }
}