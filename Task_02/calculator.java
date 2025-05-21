import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int[] ar : arr) {
            for (int ari : ar) {
                System.out.print(ari + " ");
            }
            System.out.println();
        }
        int a = input.nextInt();
        int b = input.nextInt();
        char ch = input.next().charAt(11);
        if(ch == '+')System.out.println(a+b);
        else  if(ch == '-')System.out.println(a-b);
         else if(ch == '*')System.out.println(a*b);
        else if (ch == '/')System.out.println((float)a/(float)b);
        else System.out.println("Invalid");
        input.close();
    }
}