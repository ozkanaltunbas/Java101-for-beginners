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
        System.out.print("Please Enter a birth year : ");
        int ay = input1.nextInt();
        System.out.print("Enter a day : : ");
        Scanner input2 = new Scanner(System.in);
        int day = input2.nextInt();

        if (ay>=1 && ay<=12 && day >=1 && day<=31){
            switch (ay){
                case 1:
                    if (day<=21){
                        System.out.println("Capricorn ");
                    }else {
                        System.out.println("Aquarius ");
                    }
                    break;
                case 2:
                    if (day<=19){
                        System.out.println("Aquarius ");
                    }else {
                        System.out.println("Pisces ");
                    }
                    break;
                case 3:
                    if (day<21){
                        System.out.println("Pisces ");
                    }else {
                        System.out.println("Aries ");
                    }
                    break;
                case 4:
                    if(day<21){
                        System.out.println("Aries ");
                    }else {
                        System.out.println("Taurus ");
                    }
                    break;
                case 5 :
                    if (day<=21){
                        System.out.println("Taurus ");
                    }else {
                        System.out.println("Gemini ");
                    }
                    break;
                case 6 :
                    if (day<=22){
                        System.out.println("Gemini ");
                    }else {
                        System.out.println("Cancer ");
                    }
                    break;
                case 7 :
                    if (day<=22){
                        System.out.println("Cancer ");
                    }else {
                        System.out.println("Leo ");
                    }
                    break;
                case 8:
                    if (day<=22){
                        System.out.println("Leo ");
                    }else {
                        System.out.println(" Virgo ");
                    }
                    break;
                case 9 :
                    if (day<=22){
                        System.out.println(" Virgo ");
                    }else {
                        System.out.println("Libra ");
                    }
                    break;
                case 10 :
                    if (day<=22){
                        System.out.println("Libra ");
                    }else {
                        System.out.println("Scorpio ");
                    }
                    break;
                case 11:
                    if (day<=21){
                        System.out.println("Scorpio ");
                    }else {
                        System.out.println("Sagittarius ");
                    }
                    break;
                case 12 :
                    if (day<=21){
                        System.out.println("Sagittarius ");
                    }else {
                        System.out.println("Capricorn ");
                    }
                    break;
            }
        }else {
            System.out.println("Please make sure the months and days are correct.");
              }










    }
}
