package main.java.com.mistiq.homework.string.domain.composite;


import main.java.com.mistiq.homework.string.util.UtilComposite;

import java.util.ArrayList;
import java.util.List;

public class Text implements Component {
    private String name;
    private List<NodeParagraph> components;

    public Text(String file) {
        this.components = new ArrayList<>();
        components.addAll(UtilComposite.parserText(file));
    }

    public void addComponent(NodeParagraph component) {
        components.add(component);
    }

    public void removeComponent(NodeParagraph component) {
        components.remove(component);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<NodeParagraph> getComponents() {
        return components;
    }

    public void setComponents(List<NodeParagraph> components) {
        this.components = components;
    }

    @Override
    public void show() {
        for (Component component : components) {
            component.show();
        }
    }
}
