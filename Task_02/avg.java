import java.util.Scanner;
public class avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[] values = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            values[i] = input.nextDouble();
            sum += values[i];
        }
        double avg = sum / n;
        System.out.println("The average is: " + avg);
        input.close();
    }
}
