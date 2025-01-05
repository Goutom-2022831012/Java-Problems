import java.util.Scanner;
public class oddEvenCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        int odd = 0, even = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Total even numbers: " + even);
        System.out.println("Total odd numbers: " + odd);
        input.close();
    }
}
