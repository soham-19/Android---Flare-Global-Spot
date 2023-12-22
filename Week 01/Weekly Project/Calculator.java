import java.util.Scanner;

public class Calculator {

    static float op1 = 0;
    static float op2 = 0;
    static float result = 0;

    static Scanner sc = new Scanner(System.in);

    public static void storeOperands() {

        System.out.println("Enter operand 1");
        op1 = sc.nextFloat();
        System.out.println("Enter operand 2");
        op2 = sc.nextFloat();

    }

    private static void add() {
        result = op1 + op2;
        System.out.println("Result : " + op1 + " + " + op2 + " = " + result);
    }

    private static void sub() {
        result = op1 - op2;
        System.out.println("Result : " + op1 + " - " + op2 + " = " + result);
    }

    private static void mul() {
        result = op1 * op2;
        System.out.println("Result : " + op1 + " * " + op2 + " = " + result);
    }

    private static void div() {
        try {
            result = op1 / op2;
            System.out.println("Result : " + op1 + " / " + op2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }

    private static void mod() {
        result = (int)op1 % (int)op2;
        System.out.println("Result : " + op1 + " % " + op2 + " = " + result);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("* * * Select * * *");
            System.out.println("+: Addition");
            System.out.println("-: Substraction");
            System.out.println("*: Multiplication");
            System.out.println("/: Division");
            System.out.println("%: Remainder");
            System.out.println("!: Exit");
            System.out.print("-> Enter your choice : ");

            char choice = sc.nextLine().charAt(0);

            switch (choice) {

                case '!':
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;

                case '+':
                    storeOperands();
                    add();
                    break;

                case '-':
                    storeOperands();
                    sub();
                    break;

                case '*':
                    storeOperands();
                    mul();
                    break;

                case '/':
                    storeOperands();
                    div();
                    break;

                case '%':
                    storeOperands();
                    mod();
                    break;

                default:
                    System.out.println("Invalid Input!! Try Again");

            }

            sc.nextLine();
        }
    }
}