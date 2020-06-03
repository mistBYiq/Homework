public enum TimeOfTheYear {
    SPRING("Green"), SUMMER("Rainbow"), WINTER("Blue"), AUTUMN("Yellow");

    private String moodСolor;

    TimeOfTheYear(String moodСolor) {
        this.moodСolor = moodСolor;
    }
    
    public String getMoodСolor() {
        return moodСolor;
    }

    public static void showAllValue() {
        for (TimeOfTheYear value: TimeOfTheYear.values()) {
            System.out.println(value + " " + value.ordinal() + " " + value.getMoodСolor());
        }
    }
}
