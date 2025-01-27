import java.util.Scanner;
public class OddEven{
    public static void main(String[] args){
 Scanner num = new Scanner(System.in);
 int num1 = num.nextInt();
 if(num1%2==0)System.out.println("Number is Even");
 else System.out.println("Number is Odd");
 num.close();
    }
}