import java.util.Scanner;
public class Password_app {
    public static void main(String[] args) {
        String current_password = "password";
        System.out.print("Welcome to login page please enter a username : ");
        Scanner usernameinput = new Scanner(System.in);
        String username = usernameinput.next();
        System.out.print("Hi "+ username + " please enter a password : ");
        Scanner input1 = new Scanner(System.in);
        String password = input1.next();
        if (password == current_password){
            System.out.println("Welcome sir ! ");
        }else {
            System.out.print("Password is wrong do you set a new password ? (Y or N) : ");
            Scanner input2 = new Scanner(System.in);
            String case1 = input2.next();
            switch (case1){
                case "n":
                    System.out.println("ITS CLOSED HAVE A NICE DAY SIR !");
                    break;
                case "N":
                    System.out.println("ITS CLOSED HAVE A NICE DAY SIR !");
                    break;
                case "Y":
                    System.out.println("The password you enter cannot be the same as the old password.");
                    System.out.println("The password you enter cannot be the same as the wrong one.");
                    Scanner input3 = new Scanner(System.in);
                    System.out.print("Enter a new password please ! : ");
                    String new_pass = input3.next();
                    if (new_pass==current_password || new_pass== password){
                        System.out.println("New password not be same the old password or the wrong password! ");
                        System.out.println("The password can not be created!");

                    }else{
                        System.out.println("The password created with successfully !  ");
                        System.out.println("New password is : "+new_pass);
                        System.out.println("Please do not share with anybody your Password ! ");
                    }
                    break;
            }



        }

    }
}
