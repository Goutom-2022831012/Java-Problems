class Restaurant {
    double tax_rate;
    String name;
    double bill;
    Restaurant(String name){
        this.name = name ;
    }
    void calculateBill(double price ){
        this.bill = price + price*0.1;

    }
    
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println(name + ":bill->"+bill);
    }
}

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name){
        super(name);
    }
    void calculateBill(double price ){
        this.bill = price + price*0.15;

    }
    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name){
        super(name);
    }
    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("Normal");
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast Food");
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxery Resturent");
        genericRestaurant.calculateBill(100.0);
        fastFood.calculateBill(500.0);
        fineDining.calculateBill(300.0);
        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        fineDining.displayInfo();
    }
}