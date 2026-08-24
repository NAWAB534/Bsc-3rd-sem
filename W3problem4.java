
import java.util.Scanner;
public class W3problem4{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter three numbers = ");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();
        
        double average = (a+b+c)/3;
        System.out.println("Average = " +average);
        
    }
}