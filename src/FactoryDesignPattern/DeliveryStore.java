package FactoryDesignPattern;

public abstract class DeliveryStore {
    public FoodDelivery OrderBy(String type) {
        FoodDelivery foodDelivery = Delivery(type);
        foodDelivery.prepare();
        foodDelivery.ready();
        foodDelivery.started();
        foodDelivery.arrived();
        return foodDelivery;
    }
    protected abstract FoodDelivery Delivery(String type);
}
