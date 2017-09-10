package FactoryPattern;

public class ShapeFactory  {

    public Shape createShape(String shapeType) {

        if (shapeType == null) {
            return null;
        }

        if (shapeType.equals("Rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equals("Square")) {
            return new Square();
        }
        return null;
    }

}
