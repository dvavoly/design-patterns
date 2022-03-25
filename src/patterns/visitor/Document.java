package patterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document extends Element {

    List<Element> elements = new ArrayList<>();

    public Document(String uuid) {
        super(uuid);
    }

    @Override
    public void accept(Visitor visitor) {
        for (Element e : this.elements) {
            e.accept(visitor);
        }
    }
}
