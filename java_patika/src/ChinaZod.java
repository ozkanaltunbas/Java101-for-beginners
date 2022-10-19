import java.util.Scanner;
public class ChinaZod {
    public static void main(String[] args) {
        System.out.println("Welcome to China app");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a birth day (just year) : ");
        int year = input1.nextInt();
        if (year % 12 ==0){
            System.out.println("Monkey");
        }else if (year % 12 == 1){
            System.out.println("Cockerel");
        }else if (year %12 ==2){
            System.out.println("Dog");
        }else if (year% 12 ==3){
            System.out.println("Pig");
        }else if (year %12 == 4){
            System.out.println("Mouse");
        }else if (year % 12 == 5 ){
            System.out.println("Ox");
        }else  if (year % 12 ==6 ){
            System.out.println("Tiger");
        }else if (year  % 12 ==7){
            System.out.println("Rabbit");
        } else if (year % 12 ==8) {
            System.out.println("Dragon");
        } else if (year % 12 ==9) {
            System.out.println("Snake");
        } else if (year %12 ==10) {
            System.out.println("Horse");
        } else if (year %12 ==11) {
            System.out.println("Sheep");
        }


    }
}
