package SinglePattern;

public class Singleton {

    public static class SingleHolder {

        private static final Singleton INSTANCE = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingleHolder.INSTANCE;
    }
}


