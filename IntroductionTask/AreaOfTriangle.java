import java.util.Scanner;
public class AreaOfTriangle {
    public static void main (String args[]){
        Scanner length = new Scanner(System.in);
        System.out.println("Enter base:");
        float base = length.nextFloat();
        System.out.println("Enter height:");
        float height = length.nextFloat();
        float area = (.5f*base* height);
        System.out.println("Area of the Triangle is " + area);
        length.close();

    }
}

