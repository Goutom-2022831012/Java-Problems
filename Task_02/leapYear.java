import java.util.Scanner;
public class leapYear{
    public static void main(String[] args){
 Scanner num = new Scanner(System.in);
 int num1 = num.nextInt();
 if((num1%400==0)||(num1 % 4 == 0 && num1 % 100 != 0))System.out.println("LeapYear.");
 else System.out.println("Not a leapYear.");
 num.close();
    }
}