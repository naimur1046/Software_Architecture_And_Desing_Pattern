package Structural_Design_Pattern.Composite_Design_Pattern;

public class Client
{
    public static void main(String[] args) {
        File file1=new File("This is the Frist File ");
        File file2= new File("This is the Second File");
        File file3=new File("This is the Third File");
        Directory directory=new Directory("This is the Frist Directory");
        directory.AddComponent(file1);
        directory.AddComponent(file3);

        Directory directory2=new Directory("This is the Third Directory");
        directory2.AddComponent(file2);

        Directory root=new Directory("This is the root directory");
        root.AddComponent(directory);
        root.AddComponent(directory2);
        root.DisplayDetails();
    }
}
