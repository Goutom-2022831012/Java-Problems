import java.util.Scanner;
public class CelsiusToFarenheit {
    public static void main(String args[]){
        Scanner temp = new Scanner(System.in);
        System.out.println("Temperature in °C ");
        float tempC = temp.nextFloat();
        float tempF = ((9f*tempC)/5f)+32f;
        System.out.println(tempC+"°C->"+tempF+"°F");
        temp.close();
    }
}
