import java.util.Scanner;
public class VolumeOfABall {
    public static void main(String args[]) {
        Scanner length = new Scanner(System.in);
        System.out.println("Enter radius:");
        float pi = 3.1426f;
        float rad = length.nextFloat();
        float volume = (4.0F / 3.0F) * pi * (float) Math.pow(rad, 3);
        System.out.println("Volume of the ball is " + volume);
        length.close();
    }
}
