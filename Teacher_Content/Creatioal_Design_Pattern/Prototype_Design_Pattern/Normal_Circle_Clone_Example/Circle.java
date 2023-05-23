package creational_design_patterns.Prototype.Circle;

public class Circle
{
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle() {}

    public Circle(int x,int y,int radius)
    {
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public Circle(Circle c)
    {
        if(c!=null)
        {
            this.x=c.x;
            this.y=c.y;
            this.radius=c.radius;
        }
    }
    void draw()
    {
        System.out.println("Circle Draw On ( "+x+","+y+" )"+" Color: "+color);
    }
    public Circle clone()
    {
        return new Circle(this);
    }
}
