import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        char ch = input.next().charAt(0);
        if(ch == '+')System.out.println(a+b);
        else  if(ch == '-')System.out.println(a-b);
         else if(ch == '*')System.out.println(a*b);
        else if (ch == '/')System.out.println((float)a/(float)b);
        else System.out.println("Invalid");
        input.close();
    }
}