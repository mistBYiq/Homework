package domain.compositeOne;

import java.util.ArrayList;
import java.util.List;

public class CompositeText implements Component{
    private List<Component> componentList = new ArrayList<>();

    public CompositeText() {
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
