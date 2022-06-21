package BridgeDesignPatternnew;

public class Taxi extends Automobile{
    public Taxi(WorkShop ws1, WorkShop ws2) {
        super(ws1,ws2);
    }
    @Override
    public void manufacture() {
        System.out.print("Taxi is");
        workShop1.work();
        workShop2.work();
    }
}
