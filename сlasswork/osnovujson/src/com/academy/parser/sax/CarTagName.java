package com.academy.parser.sax;

import java.util.Collections;
import java.util.Set;

public enum CarTagName {
    CARS("cars"), CAR("car"), TTYPE("ttype"), VIN("vin"),
    COLOR("color"), YEAR("year"), MODEL("model");
    private String tagName;

    CarTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
    private static Set<CarTagName> tags
            = Collections.unmodifiableSet(Set.of(CarTagName.values()));

}
