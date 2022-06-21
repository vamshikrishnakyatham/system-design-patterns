package BridgeDesignPatternnew;

public class Bus extends Automobile{
    public Bus(WorkShop ws1,WorkShop ws2) {
        super(ws1,ws2);
    }
    @Override
    public void manufacture() {
        System.out.print("Bus is ");
        workShop1.work();
        workShop2.work();
    }
}
