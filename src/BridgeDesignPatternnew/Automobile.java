package BridgeDesignPatternnew;

public abstract class Automobile {
    protected WorkShop workShop1;
    protected WorkShop workShop2;

    protected Automobile(WorkShop ws1,WorkShop ws2) {
        this.workShop1 = ws1;
        this.workShop2 = ws2;
    }
    abstract public void manufacture();
}
