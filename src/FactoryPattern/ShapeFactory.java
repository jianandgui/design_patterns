package FactoryPattern;


import AbstractFactoryPattern.ExceptionUtils;

public class ShapeFactory  {

    //方案：缺点是每增加一个派生类 就必须修改factory逻辑
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

    //使用反射解决需要反复修改factory类的问题
    public static Object getClass(Class<? extends Shape> clazz) {

        return ExceptionUtils.getObjByClazz(clazz);
    }

}
