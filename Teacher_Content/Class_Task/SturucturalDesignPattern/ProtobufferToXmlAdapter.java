package structural_design_patterns.adapter;

public class ProtobufferToXmlAdapter implements IAdapter<Protobuffer> {
    private Protobuffer protobuffer;

    public ProtobufferToXmlAdapter(Protobuffer protobuffer) {
        this.protobuffer = protobuffer;
    }

    @Override
    public XML convert(Protobuffer protobuffer) {
        return this.protobuffer.convertToXML();
    }
}
