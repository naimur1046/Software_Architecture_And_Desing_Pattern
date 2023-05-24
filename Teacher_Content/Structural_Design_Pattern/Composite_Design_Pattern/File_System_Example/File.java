package Structural_Design_Pattern.Composite_Design_Pattern;

public class File implements File_System_Component
{
    private String name;

    File(String name)
    {
        this.name=name;
    }

    @Override
    public void DisplayDetails() {
        System.out.println("File : "+name);
    }
}
