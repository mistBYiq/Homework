package domain.compositeOne;

public class LeafSymbol implements Component {
    private Long id;
    private char value;

    public LeafSymbol() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    @Override
    public void read() {
        System.out.print(value);
    }
}
