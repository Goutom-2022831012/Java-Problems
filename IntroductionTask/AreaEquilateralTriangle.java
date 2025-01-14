import java.util.Scanner;
public class AreaEquilateralTriangle {
    public static void main(String args[]) {
        Scanner length = new Scanner(System.in);
        System.out.println("Arm:");
        float arm = length.nextFloat();
        float area = (((float) Math.pow(3,.5))/4f)*((float) Math.pow(arm,2));
        System.out.println("Area: " + area);
        length.close();
    }
}
