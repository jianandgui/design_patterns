package AbstractFactoryPattern.size;

public class Big implements Size {
    @Override
    public void volume() {
        System.out.println("他是个大号尺码");
    }
}
