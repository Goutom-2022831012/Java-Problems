public class SumSeries{
    public static void main(String[] args){
        int sum=0;
        for(int i=2;i<=20;i+=2){
            sum+=i;
        }
        System.out.println("Sum with for loop "+sum);
        System.out.println("");
        sum=0;
        int i=2;
        while(i<=20){
              sum+=i;
              i+=2;
        }
 System.out.println("Sum with while loop "+sum);
        System.out.println("");        
        i = 2;
        sum=0;
        do{
            sum+=i;
              i+=2;
        } 
        while(i<=20);
System.out.println("Sum with do-while loop "+sum);
        System.out.println(""); 
        sum = 0;  
                for(i=1;i<=20;i+=2){
            sum+=i;
        }
System.out.println("Sum with for loop "+sum);
        System.out.println("");  
        sum = 0;
              i=1;
        while(i<=20){
              sum+=i;
              i+=2;
        }
        System.out.println("Sum with while loop "+sum);
        System.out.println("");  
        sum = 0;
        i = 1;
        do{
            sum+=i;
              i+=2;
        } 
        while(i<=20);
        System.out.println("Sum with do-while loop "+sum);
        
    }
}