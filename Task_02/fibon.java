import java.util.Scanner;
public class Fibon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = 0, second = 1;
         System.out.print(first + " ");
     System.out.print(second + " ");
  for (int next = first + second; next <= 89; next = first + second) {
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        System.out.println();
        input.close();
    }
}
