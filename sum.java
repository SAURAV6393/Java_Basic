
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.print("Please Enter a number : ");
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        System.out.println("Sum of "+ x +" and "+ y + " is "+(x+y));
    }
}
