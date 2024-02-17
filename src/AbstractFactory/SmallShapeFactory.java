package AbstractFactory;

public class SmallShapeFactory extends ShapeFactory{


    @Override
    public Shape getShape(String shape) {
        if(shape.equals("circle")){
            return new SmallCircle();
        } else {
            return new SmallRectangle();
        }
    }
}
