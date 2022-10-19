import java.util.Scanner;
public class Suggest_activity {
    public static void main(String[] args) {
        /*
       Suggest to "Ski" if the temperature is less than 5.
        Suggest the "Cinema" event if the temperature is between 5 and 15.
        Suggest the "Picnic" event if the temperature is between 15 and 25.
        Suggest "Swimming" if the temperature is greater than 25.
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



