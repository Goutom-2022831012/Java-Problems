import java.util.Scanner;
public class AreaCircle {
    public static void main(String args[]) {
        Scanner length = new Scanner(System.in);
        System.out.println("Radius:");
        float pi = 3.1426f;
        float rad = length.nextFloat();
        float area =  pi * (float) Math.pow(rad, 2);
        System.out.println("Area: " + area);
        length.close();
    }
}
