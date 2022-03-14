package main.java.com.mistiq.classwork.reflect;

public class Passport<ID extends Number, T extends Registration> {
    private ID identifier;

    private T passportNumber;

    private PassportType passportType = PassportType.DEFAULT;

    public Passport() {
    }

    public Passport(ID identifier, T passportNumber) {
        this.identifier = identifier;
        this.passportNumber = passportNumber;
    }

    public ID getIdentifier() {
        return identifier;
    }

    public void setIdentifier(ID identifier) {
        this.identifier = identifier;
    }

    public T getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(T passportNumber) {
        this.passportNumber = passportNumber;
    }

    public PassportType getPassportType() {
        return passportType;
    }

    public void setPassportType(PassportType passportType) {
        this.passportType = passportType;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "identifier=" + identifier +
                ", passportNumber=" + passportNumber +
                ", passportType=" + passportType +
                '}';
    }
}
