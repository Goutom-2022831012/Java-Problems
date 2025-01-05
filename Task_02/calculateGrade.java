import java.util.Scanner;
public class calculateGrade{
    public static void main(String[] args){
        Scanner inn= new Scanner(System.in);
        int mark= inn.nextInt();
        if(mark>=0 && mark<=39)
        System.out.println("Grade:F");
         else if(mark>=40 && mark<=59)
        System.out.println("Grade:C+");
         else if(mark>=60 && mark<=69)
        System.out.println("Grade:B");
        else  if(mark>=70 && mark<=79)
        System.out.println("Grade:A-");
         else if(mark>=80 && mark<=89)
        System.out.println("Grade:A");
        else if(mark>=90 && mark<=100)
        System.out.println("Grade:A+");
        else System.out.println("Invalid Mark");
        inn.close();
    }
}