import java.util.Scanner;
public class note_app {
    public static void main(String[] args) {
        // math pys turkish hist music cham
        System.out.println("Please enter your 'Mathematics', 'Physics', 'Chemistry', 'History', 'Turkish' and 'Music' numbers in order.");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);
        System.out.print("please enter your math grade: ");
        double math = input1.nextDouble();
        System.out.print("Please enter your physics grade : ");
        double psy = input2.nextDouble();
        System.out.print("Please enter your chemistry grade : ");
        double cham = input3.nextDouble();
        System.out.print("Please enter your history note : ");
        double hist = input4.nextDouble();
        System.out.print("Please enter your Turkish note : ");
        double turkish = input5.nextDouble();
        System.out.print("Please enter your music note : ");
        double music = input6.nextDouble();

        double result = (math+psy+cham+hist+turkish+music)/6;
        System.out.println("YOUR AVERAGE : "+result);

    }
}
