import java.util.Scanner;
public class Kdv_app {
    public static void main(String[] args) {
        double kdv = 0.18;
        System.out.print("Please enter price : ");
        Scanner input = new Scanner(System.in);
        double many = input.nextDouble();
        System.out.println("Price without KDV : "+many+ " $");
        double kdvli = kdv*many + many;
        System.out.println("Price with KDV : "+kdvli+" $");
        double kdv_tutari = kdv*many;
        System.out.println("KDV price "+kdv_tutari+" $");
        System.out.println("Have a nice day !");

    }
}
