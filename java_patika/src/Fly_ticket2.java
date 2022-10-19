import java.util.Scanner;
public class Fly_ticket2 {
    public static void main(String[] args) {
        System.out.println("Welcome sir ! ");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a name ! : ");
        String name = input1.next();
        System.out.print("Please enter a age "+name+" : ");
        Scanner input4 = new Scanner(System.in);
        int age = input4.nextInt();
        System.out.print("Please enter a road (KM) "+name+" : ");
        Scanner input2 = new Scanner(System.in);
        int road = input2.nextInt();
        System.out.print("Please enter a only road or split ? (1 or 2) : ");
        Scanner input3 = new Scanner(System.in);
        int a = input3.nextInt();
        System.out.println("Please wait checking your input.....");
        if((age>0)&&(road>0)&&(a==1 ||a==2)){
            System.out.println("The information is corrct ! ");
            double price = road*0.10;
            double count= 0;
            double donus=0;


         if (age<12){
             count = 0.5;
         }
         if (age>12 &&age<24){
             count=0.1;
         }
         if (age>65){
             count =0.3;
         }
        double price2 = (1-count)*price;

        switch (a){
            case 1:
                break;
            case 2:
                donus=0.2;
                price2=(1-donus)*price2;
                break;
            default:
                System.out.println("Please check your input!");
                break;
        }
            System.out.println(price2);
        }else{
            System.out.println("Please check the information !!!");
        }

    }
}
