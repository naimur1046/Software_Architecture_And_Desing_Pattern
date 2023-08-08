package structural_design_patterns.adapter;

public class Client {

    public static void main(String[] args) {
        JSON json = new JSON("json data");
        Protobuffer protobuffer = new Protobuffer("protobuffer data");

        IAdapter<JSON> iAdapter = new JsonToXmlAdapter(json);

        IAdapter<Protobuffer> iAdapter2 = new ProtobufferToXmlAdapter(protobuffer);
        XML xml = iAdapter.convert(json);
        XML xml2 = iAdapter2.convert(protobuffer);

        System.out.println(xml.getData());
        System.out.println(xml2.getData());
    }

}
