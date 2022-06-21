package AbstractDesignPattern;

public class FactoryProducer{
    public static ApplianceAbstractFactory getApplianceFactory(){
        return new Electronic();
    }
    public static DWAbstractFactory getDWFactory(){
        return new DWClass();
    }
}
