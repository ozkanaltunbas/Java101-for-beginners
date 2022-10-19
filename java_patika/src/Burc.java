import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        /*
        Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
         */
        System.out.println("Welcome to Burc app");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı giriniz : ");
        int ay = input1.nextInt();
        System.out.print("Lütfen günü giriniz : ");
        Scanner input2 = new Scanner(System.in);
        int gun = input2.nextInt();

        if (ay>=1 && ay<=12 && gun>=1 && gun<=31){
            switch (ay){
                case 1:
                    if (gun<=21){
                        System.out.println("Oğlak burcu");
                    }else {
                        System.out.println("Kova burcu");
                    }
                    break;
                case 2:
                    if (gun<=19){
                        System.out.println("Kova burcu");
                    }else {
                        System.out.println("Balık burcu");
                    }
                    break;
                case 3:
                    if (gun<21){
                        System.out.println("balık burcu");
                    }else {
                        System.out.println("koç burcu");
                    }
                    break;
                case 4:
                    if(gun<21){
                        System.out.println("Koç burcu");
                    }else {
                        System.out.println("Boğa burcu");
                    }
                    break;
                case 5 :
                    if (gun<=21){
                        System.out.println("Boğa burcu");
                    }else {
                        System.out.println("İkizler burcu");
                    }
                    break;
                case 6 :
                    if (gun<=22){
                        System.out.println("İkizler burcu");
                    }else {
                        System.out.println("Yengeç burcu");
                    }
                    break;
                case 7 :
                    if (gun<=22){
                        System.out.println("Yengeç burcu");
                    }else {
                        System.out.println("Aslan burcu");
                    }
                    break;
                case 8:
                    if (gun<=22){
                        System.out.println("Aslan burcu");
                    }else {
                        System.out.println("Başak burcu");
                    }
                    break;
                case 9 :
                    if (gun<=22){
                        System.out.println("Başak burcu");
                    }else {
                        System.out.println("Terazi burcu");
                    }
                    break;
                case 10 :
                    if (gun<=22){
                        System.out.println("Terazi burcu");
                    }else {
                        System.out.println("Akrep burcu");
                    }
                    break;
                case 11:
                    if (gun<=21){
                        System.out.println("Akrep burcu");
                    }else {
                        System.out.println("Yay burcu");
                    }
                    break;
                case 12 :
                    if (gun<=21){
                        System.out.println("Yay burcu");
                    }else {
                        System.out.println("Oğlak burcu");
                    }
                    break;
            }
        }else {
            System.out.println("LÜtfen ay ve günü doğru aralıklarda olduğundan emin olun.");
              }










    }
}
