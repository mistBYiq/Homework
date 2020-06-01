package domain;

public class GroundTransportation extends Transport {
    protected String enginesType;

    protected int weight;

    public String getEnginesType() {
        return enginesType;
    }

    public void setEnginesType(String enginesType) {
        this.enginesType = enginesType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public GroundTransportation(int transportId, int carryingCapacity, String enginesType, int weight) {
        super(transportId, carryingCapacity);
        this.enginesType = enginesType;
        this.weight = weight;
    }

    @Override
    public void move() {
        System.out.println("Включить двигатель. Начать движение");
    }

    @Override
    public void stay() {
        System.out.println("Остановиться. Выключить двигатель");
    }
}
