public class Cat {
    private int weight = 10;
    private Computer.PowerSupply
    private String nameCat;
    private int ageCat;

    public Cat() {
    }

    public Cat(int weight, String nameCat, int ageCat) {
        this.weight = weight;
        this.nameCat = nameCat;
        this.ageCat = ageCat;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public static void feedCat(Cat cat) {
        System.out.println("Cat eat");
    }
}
