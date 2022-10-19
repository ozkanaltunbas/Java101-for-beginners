import java.util.Scanner;
public class note_app {
    public static void main(String[] args) {
        // math pys turkish hist music cham
        System.out.println("lütfen sırayla 'Matematik','fizik','kimya','tarih','türkçe' ve 'müzik' nolarınızı giriniz.");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);
        System.out.print("lütfen matematik notunuzu giriniz : ");
        double math = input1.nextDouble();
        System.out.print("Lütfen fizik notunuzu giriniz : ");
        double psy = input2.nextDouble();
        System.out.print("Lütfen kimya notunuzu giriniz : ");
        double cham = input3.nextDouble();
        System.out.print("Lütfen tarih notunuzu giriniz : ");
        double hist = input4.nextDouble();
        System.out.print("Lütfen türkçe notunuzu giriniz : ");
        double turkish = input5.nextDouble();
        System.out.print("Lütfen mizik notunuzu giriniz : ");
        double music = input6.nextDouble();

        double result = (math+psy+cham+hist+turkish+music)/6;
        System.out.println("ORTALAMANIZ : "+result);

    }
}
