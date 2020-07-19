package domain;

import java.io.Serializable;

public enum PassportType implements Serializable {
    DEFAULT("Default"), RESIDENCE("Residence type"), PP("PP Type");
    //new PassportType("DEFAULT")
    //new PassportType("RESIDENCE")
    //new PassportType("PP")

    private String typeDescription;

    PassportType(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public static void printAllValues() {
        for (PassportType value : PassportType.values()) {
            System.out.println(value + " " + value.ordinal());
        }
    }
}
