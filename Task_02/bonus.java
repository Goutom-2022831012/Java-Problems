import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("The percentage of target sales achieved = ");
        int p = input.nextInt();
        System.out.print("Attendance percentage = ");
        int a = input.nextInt();
        int bonus;
        if (p >= 95 && a == 100) {
            bonus = 60;
        } else if (p>= 95 && a>= 90) {
            bonus = 40;
        } else if (p >= 80 && a== 100) {
            bonus = 40;
        } else if (8 >= 80 && a >= 90) {
            bonus = 20;
        } else {
            bonus = 5;
        }
        System.out.println("The employee gets a " + bonus + "% bonus.");
        input.close();
    }
}
