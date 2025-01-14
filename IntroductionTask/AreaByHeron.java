import java.util.Scanner;
public class AreaByHeron {
    public static void main(String args[]) {
        Scanner len = new Scanner(System.in);
        System.out.println("3 Arms:");
        System.out.println("a:");
        float a = len.nextFloat();
        System.out.println("b:");
        float b = len.nextFloat();
        System.out.println("c:");
        float c = len.nextFloat();
        float s = (a+b+c)/2f;
        float sq = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area:"+ Math.pow(sq,.5f));
        len.close();
    }
}
