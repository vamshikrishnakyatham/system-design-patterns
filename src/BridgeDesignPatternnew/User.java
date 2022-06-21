package BridgeDesignPatternnew;

public class User {
    public static void main(String[] args) {
        Automobile taxi = new Taxi(new Produce(),new Assemble());
        taxi.manufacture();
    }
}
