import java.util.Scanner;
public class Taxi_app {
    public static void main(String[] args) {
        System.out.println("Welcome to Txi app");
        int start = 10;
        double per_km = 2.2;
        Scanner input = new Scanner(System.in);
        System.out.print("How many KM we will go  ? : ");
        int away= input.nextInt();
        double result = per_km*away;
        if (result<=20){
            System.out.println("Your taxi bill is:  "+20);
        }else{
            System.out.println("Your taxi bill is: "+per_km*result+start);

        }










    }
}
