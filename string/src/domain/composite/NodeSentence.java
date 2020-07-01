package domain.composite;

import java.util.ArrayList;
import java.util.List;

public class NodeSentence extends ArrayList implements Component {
    private Long id;
    private List<LeafWord> components;

    public NodeSentence(List<LeafWord> components) {
        this.components = new ArrayList<>();
        this.components.addAll(components);
    }

    public void addComponent(LeafWord component) {
        components.add(component);
    }

    public void removeComponent(LeafWord component) {
        components.remove(component);
    }

    public void removeComponents(List<LeafWord> removeList) {
        for (LeafWord component : removeList) {
            removeComponent(component);
        }
    }

    public List<LeafWord> getComponents() {
        return components;
    }

    public void setComponents(List<LeafWord> components) {
        this.components = components;
    }

    @Override
    public void show() {
        for (Component component : components) {
            component.show();
        }
    }
}
