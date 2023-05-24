package Structural_Design_Pattern.Adapter_Design_Pattern;

public class JsonToXmlAdapter implements IAdapter {
    private JSON json;

    JsonToXmlAdapter(JSON json)
    {
        this.json=json;
    }
    @Override
    public XML convert(JSON json) {
        return this.json.ConvertToXML();
    }
}
