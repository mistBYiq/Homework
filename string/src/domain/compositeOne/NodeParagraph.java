package domain.compositeOne;

import java.util.ArrayList;
import java.util.List;

public class NodeParagraph implements Component {
    private Long id;
    private List<Component> componentList = new ArrayList<>();

    public NodeParagraph() {
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void removeComponent(Component component) {
        componentList.remove(component);
    }

    @Override
    public void read() {
        for (Component component : componentList) {
            component.read();
        }
    }
}
