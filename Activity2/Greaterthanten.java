package Activity2;
import java.util.Scanner;

public class Greaterthanten {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
         Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();
         if(num>10){
            System.out.println("Yes I'm Greater");
         }else{
            System.out.println("Sorry I feel bad");
         }
    }
}
