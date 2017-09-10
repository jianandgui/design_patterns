package AbstractFactoryPattern;

public class ExceptionUtils {

    public static Object getObjByClazz(Class<?extends Object> clazz) {

        if (clazz == null) {
            return null;
        }
        try {
            return Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;

    }
}
