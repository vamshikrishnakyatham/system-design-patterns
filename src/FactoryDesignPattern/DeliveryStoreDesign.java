package FactoryDesignPattern;

public class DeliveryStoreDesign extends DeliveryStore {
    @Override
    protected FoodDelivery Delivery(String type) {
        if(type.equals("Swiggy")) {
            return new Swiggy();
        }
        else if(type.equals("Zomato")) {
            return new Zomato();
        }
        else {
            return null;
        }
    }
}
