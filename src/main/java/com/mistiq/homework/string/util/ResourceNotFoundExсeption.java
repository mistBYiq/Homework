package main.java.com.mistiq.homework.string.util;

public class ResourceNotFoundExсeption extends RuntimeException {
    public ResourceNotFoundExсeption() {
        super();
    }

    public ResourceNotFoundExсeption(String message) {
        super(message);
    }

    public ResourceNotFoundExсeption(String message, Throwable cause) {
        super(message, cause);
    }
}