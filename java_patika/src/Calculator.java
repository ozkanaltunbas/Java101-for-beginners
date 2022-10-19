import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator app");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a first number ( its must be integer): ");
        int num1 = input1.nextInt();
        System.out.print("Please enter a second number ( its must be does not equal to zero) : ");
        Scanner input2 = new Scanner(System.in);
        int num2 = input2.nextInt();
        System.out.print("Please choose one ( * / + - ): ");
        Scanner input3 = new Scanner(System.in);
        String opr = input3.next();


        switch (opr) {
            case "*" -> {
                int result = num1 * num2;
                System.out.println("MULTIPLE RESULT IS : " + result);
            }
            case "/" -> {
                int result2 = num1 / num2;
                System.out.println("DIVIDE RESULT IS : " + result2);
            }
            case "+" -> {
                int result3 = num1 + num2;
                System.out.println("ADDITION RESULT IS : " + result3);
            }
            case "-" -> {
                int result4 = num1 - num2;
                System.out.println("SUBTRACTION RESULT IS : " + result4);
                break;
            }


        }
    }
}
