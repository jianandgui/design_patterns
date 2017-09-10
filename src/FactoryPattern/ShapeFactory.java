package FactoryPattern;

import sun.security.provider.SHA;

import java.io.OutputStreamWriter;

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

    public static Object getClass(Class<? extends Shape> clazz) {

        Object obj = null;
        try{
            obj = Class.forName(clazz.getName()).newInstance();

        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }

}
