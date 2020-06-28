package domain.compositeTwo;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> componentList = new ArrayList<>();

    public Composite() {
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

//    public void addComponents(List<Component> components) {
//        componentList.addAll(components);
//    }

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
