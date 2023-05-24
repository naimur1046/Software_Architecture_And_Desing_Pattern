package Structural_Design_Pattern.Composite_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements File_System_Component
{
    String name;
    private List<File_System_Component> children;
    Directory(String name)
    {
        this.name=name;
        children = new ArrayList<>();
    }

    public void AddComponent(File_System_Component file_system_component)
    {
        children.add(file_system_component);
    }
    public void RemoveComponent(File_System_Component file_system_component)
    {
        children.remove(file_system_component);
    }
    public void ShowDetails()
    {
        System.out.println("Directory Names : "+name);
        System.out.println("Contents Are : ");
        for (File_System_Component f:children)
        {
            f.DisplayDetails();
        }
    }
    @Override
    public void DisplayDetails() {
        System.out.println("Directory is "+name);
    }
}
