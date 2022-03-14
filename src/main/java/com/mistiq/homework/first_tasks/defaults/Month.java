package main.java.com.mistiq.homework.first_tasks.defaults;

public enum Month {

    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5),
    JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
    NOVEMBER(11), DECEMBER(12);

    private int numberMonth;

    Month(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    @Override
    public String toString() {
        return numberMonth +
                "   " + super.toString();
    }
}
