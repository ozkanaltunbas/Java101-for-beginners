import java.util.Objects;
import java.util.Scanner;
public class Fly_ticket {
    public static void main(String[] args) {
        System.out.println("Welcome to Fly Ticket app");
        System.out.print("Welcome sir please enter a full name : ");
        Scanner input1 = new Scanner(System.in);
        String name = input1.next();
        System.out.println("Hello "+name+" Please enter a requested information" );
        Scanner input2 = new Scanner(System.in);
        System.out.print("Where will you fly from ? (Istanbul,New york,Toronto,London) : ");
        String from1 = input2.next();
        if (from1 =="Istanbul"){
            System.out.println("Please check your input ! ");
        }else {
            switch (from1){
                case "Istanbul":
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Where do you want to go ?(New york,Toronto,London) : ");
                    String fromistanbul = input3.next();
                    if (fromistanbul =="New york" || fromistanbul =="Toronto" ||fromistanbul=="London"){
                        System.out.print("Is it One way or dobule trip ? (1 or 2)");
                        Scanner input4 = new Scanner(System.in);
                        int onortwo = input4.nextInt();
                        System.out.print("How is your age "+name+" ?");
                        Scanner input5 = new Scanner(System.in);
                        int age = input5.nextInt();
                    }else{
                        System.out.println("Please check your information ! ");
                    }
                    break;










            }
        }

    }
}
