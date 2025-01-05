import java.util.Scanner;
public class positive{
    public static void main(String[] args){
        Scanner data=new Scanner(System.in);
        int a = data.nextInt();
        if(a>0) System.out.println("It is positive");
        else System.out.println("Not positive");
        data.close();
    }
}