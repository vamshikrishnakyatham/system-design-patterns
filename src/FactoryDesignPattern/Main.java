package FactoryDesignPattern;

public class Main {
    public static void main(String [] args) {
        DeliveryStore app = new DeliveryStoreDesign();
        FoodDelivery application = app.OrderBy("Swiggy");

    }
}
