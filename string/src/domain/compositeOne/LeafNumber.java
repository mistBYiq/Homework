package domain.compositeOne;

public class LeafNumber implements Component {
    private Long id;
    private Number value;

    public LeafNumber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    @Override
    public void read() {
        System.out.print(value);
    }
}
