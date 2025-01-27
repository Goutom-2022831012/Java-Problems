import java.util.Scanner;
public class Medal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Letter grade =  ");
        double num = input.nextDouble();
        System.out.print("Did the student complete the semester? (y/n): ");
        char c = input.next().charAt(0);
        if (c=='y') {
            if (num >= 3.5) {
                System.out.println("The student is awarded a medal!");
            } else {
                System.out.println("The student is not eligible for a medal.");
            }
        } else {
            System.out.println("The student did not complete the semester, so no medal.");
        }
        input.close();
    }
}
