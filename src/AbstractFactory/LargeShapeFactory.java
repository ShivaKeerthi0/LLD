package AbstractFactory;

public class LargeShapeFactory extends ShapeFactory{

    @Override
    public Shape getShape(String shape) {

        if(shape.equals("circle")){
            return new LargeCircle();
        } else{
            return new LargeRectangle();
        }
    }
}
