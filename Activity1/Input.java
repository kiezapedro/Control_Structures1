package Activity1;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.println("Enter your string: ");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println("The String is " +str);
        System.out.println("Enter your number: ");
        int num = scn.nextInt();
        System.out.println("Number is " +num);
        System.out.println("Enter your float: ");
        float fnum = scn.nextFloat();
        System.out.println("The floating num is " +fnum);
    }
}
