package main.java.com.mistiq.classwork.reflect;

import java.io.Serializable;
import java.security.Timestamp;

public class Registration implements Serializable {
    private String issued;
    private Timestamp expired;

    public String getIssued() {
        return issued;
    }

    public void setIssued(String issued) {
        this.issued = issued;
    }

    public Timestamp getExpired() {
        return expired;
    }

    public void setExpired(Timestamp expired) {
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "issued='" + issued + '\'' +
                ", expired=" + expired +
                '}';
    }
}
