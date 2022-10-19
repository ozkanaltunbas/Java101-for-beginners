import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Sort_numbers {
    public static void main(String[] args) {
        System.out.println("Welcome to sort app !");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Please enter a how many added do you want a number ? :  ");
        int num = input1.nextInt();
        int loop=num;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        while (loop>0){
            loop=loop-1;
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter a num : ");
            int number = input2.nextInt();
            array1.add(number);
        }
        System.out.println("Normal List : "+array1);
        Collections.sort(array1);
        System.out.print("Sorted Array List : "+array1);





    }
}
