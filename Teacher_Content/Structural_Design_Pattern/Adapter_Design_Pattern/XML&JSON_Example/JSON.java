package Structural_Design_Pattern.Adapter_Design_Pattern;

public class JSON
{
    public JSON()
    {

    }
    public  JSON(String data)
    {

    }
    XML ConvertToXML()
    {
        return new XML("Stringified JSON data");
    }
}
