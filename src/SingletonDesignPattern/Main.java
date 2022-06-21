package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        //Earth earth1 = new Earth();
        Earth earth1 = Earth.getUniqueInstance();
        Earth earth2 = Earth.getUniqueInstance();
        Earth earth3 = Earth.getUniqueInstance();

        System.out.println(earth1);
        System.out.println(earth2);
        System.out.println(earth3);

    }
}
