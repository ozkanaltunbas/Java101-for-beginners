import java.util.Scanner;
public class Plusyear {
    public static void main(String[] args) {

        System.out.println("Welcome to plus year app");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a year : ");
        int year = input1.nextInt();
        if (year%100==0 && year%400==0 && year%4==0){
            System.out.println(year + " bir artık yıldır !");
        } else if (year%4==0 && year%100!=0){
            System.out.println(year + " bir artık yıldır !");
        }else {
            System.out.println(year + " bir artık yıl değildir !");
        }






    }

    }



