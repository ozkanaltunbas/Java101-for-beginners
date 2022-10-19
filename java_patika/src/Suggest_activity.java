import java.util.Scanner;
public class Suggest_activity {
    public static void main(String[] args) {
        /*
        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner
         */
        System.out.println("Welcome to suggest activity app ! ");
        System.out.print("How many degrees is it there ? : ");
        Scanner input1 = new Scanner(System.in);
        int cel = input1.nextInt();
        if (cel<=5){
            System.out.println("Do you want to ski :) ?");

        }else if (5<cel && 15>cel){
            System.out.println("Do you want go to cinema :) ?");
        }else if (15<cel && cel<25){

            System.out.println("Do you want go to picinc :) ?");
        }else if (25<cel){
            System.out.println("Do you want go to  swim :) ?");
        }

    }

}



