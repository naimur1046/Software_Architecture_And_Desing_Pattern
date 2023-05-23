package creational_design_patterns.Prototype.Circle;

public class Client
{
    public static void main(String[] args) {
        Circle c1=new Circle(10,20,20);

        Circle c2=c1.clone();
        c2.draw();
    }
}
