package Structural_Design_Pattern.Adapter_Design_Pattern;

public class Client
{
    public static void main(String[] args) {
        JSON json = new JSON("Json Data");
        IAdapter iAdapter=new JsonToXmlAdapter(json);
        XML xml=iAdapter.convert(json);
    }

}
