import java.util.Scanner;
public class greatestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        int greatest = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }
        System.out.println("The greatest number in the series is: " + greatest);
        input.close();
    }
}
