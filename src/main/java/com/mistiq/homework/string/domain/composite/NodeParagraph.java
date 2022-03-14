package main.java.com.mistiq.homework.string.domain.composite;

import java.util.ArrayList;
import java.util.List;

public class NodeParagraph extends ArrayList implements Component {
    private Long id;
    private List<NodeSentence> components;

    public NodeParagraph(List<NodeSentence> sentences) {
        this.components = new ArrayList<>();
        components.addAll(sentences);
    }

    public void addComponent(NodeSentence component) {
        components.add(component);
    }

    public void addComponents(List<NodeSentence> components) {
        this.components.addAll(components);
    }

    public void removeComponent(NodeSentence component) {
        components.remove(component);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id++;
    }

    public List<NodeSentence> getComponents() {
        return components;
    }

    public void setComponents(List<NodeSentence> components) {
        this.components = components;
    }

    @Override
    public void show() {
        System.out.println("\n[paragraph] ");
        for (Component component : components) {
            component.show();
        }
    }
}
