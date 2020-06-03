package domain;

public abstract class Transport implements Deterioration, Marker {
    protected int transportId;

    protected int carryingCapacity;

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }
    public int getTransportId() {
        return transportId;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
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
