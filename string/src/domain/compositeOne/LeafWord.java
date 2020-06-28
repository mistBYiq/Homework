package domain.compositeOne;

public class LeafWord implements Component {
    private Long id;
    private String value;

    public LeafWord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void read() {
        System.out.print(value);
    }
}
