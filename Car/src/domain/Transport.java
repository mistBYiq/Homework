package domain;

public abstract class Transport {
    protected int transportId;

    protected int carryingCapacity;

    public int getTransportId() {
        return transportId;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public Transport(int transportId, int carryingCapacity) {
        this.transportId = transportId;
        this.carryingCapacity = carryingCapacity;
    }

    public abstract void move();

    public abstract void stay();
}
