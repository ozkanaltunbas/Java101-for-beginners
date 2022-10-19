import java.util.Scanner;
public class Kdv_app {
    public static void main(String[] args) {
        double kdv = 0.18;
        System.out.print("Lütfen fiyat giriniz : ");
        Scanner input = new Scanner(System.in);
        double many = input.nextDouble();
        System.out.println("KDV siz fiyatı : "+many+ " TL");
        double kdvli = kdv*many + many;
        System.out.println("KDV li fiyatı : "+kdvli+" TL");
        double kdv_tutari = kdv*many;
        System.out.println("KDV tutarı "+kdv_tutari+" TL");
        System.out.println("İYİ GÜNLER DİLERİM");

    }
}
