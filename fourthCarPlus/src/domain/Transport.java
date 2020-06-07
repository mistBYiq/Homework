package domain;

public abstract class Transport implements Deterioration, Marker {

    protected static final String MADE_IN = "Made in Belarus";

    protected int transportId;

    protected int carryingCapacity;

    public Transport(int transportId, int carryingCapacity) {
        this.transportId = transportId;
        this.carryingCapacity = carryingCapacity;
    }


    public static String getMadeIn() {
        return MADE_IN;
    }

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

    public abstract void move();

    public abstract void stay();

}
