package FactoryDesignPattern;

public class Swiggy extends FoodDelivery{

    @Override
    public void prepare() {
        System.out.println("Preparing Food by means of Swiggy");
    }

    @Override
    public void ready() {
        System.out.println("Food is ready and to be picked up by Swiggy");
    }

    @Override
    public void started() {
        System.out.println("Swiggy Delivery Boy started from the restaurant with your order");
    }

    @Override
    public void arrived() {
        System.out.println("Your food is arrived. Thanks for ordering on Swiggy");
    }
}