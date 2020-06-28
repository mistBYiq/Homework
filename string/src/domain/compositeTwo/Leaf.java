package domain.compositeTwo;

public class Leaf implements Component{
    private Long id;
    private String value;

    {
        id = 0L;
        value = "";
    }

    public Leaf() {
    }

    public Long getId() {
        return id;
    }

    public void setId() {
        this.id++;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void read() {
        System.out.print(getValue());
    }

}
