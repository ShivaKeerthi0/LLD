package AbstractFactory;

public abstract class ShapeFactory {

    public static  ShapeFactory getFactory(String factoryType){
        if(factoryType.equals("Small")){
            return new SmallShapeFactory();
        }else{
            return  new LargeShapeFactory();
        }
    }

    public abstract Shape getShape(String shape);
}
