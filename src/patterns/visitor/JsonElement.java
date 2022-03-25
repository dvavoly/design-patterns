package patterns.visitor;

public class JsonElement extends Element{

    public JsonElement(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
