package creational_design_patterns.Singleton_Pattern;

public class SingletonPatternDemo
{
    public static void main(String[] args) {
        SingleObject object= SingleObject.getInstance();
        object.showMessage();
    }
}
