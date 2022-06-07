package SingletonDesignPattern;

public class Earth {
    private int timeofrotation;
    //Early Instantiation is commented one
    //private volatile static Earth UniqueInstance = new Earth();
    //Lazy or Double Check Instantiation
    private volatile static Earth UniqueInstance;
    private Earth() {
        timeofrotation = 24;
    }
    public static Earth getUniqueInstance() {
        if(UniqueInstance == null) {
            synchronized (Earth.class) {
                if(UniqueInstance == null) {
                    UniqueInstance = new Earth();
                }
            }
        }
        return UniqueInstance;
    }
}
