package domain;

public class Good {
    private Long idGood;
    private String category;
    private String nameGood;
    private Person salesman;
    private Double price;
    private Integer quantityGoodsStock;

    {
        idGood = 0L;
        category = "Not Selected";
        nameGood = "Good";
        salesman = new Person();
        price = 0.1;
        quantityGoodsStock = 1;
    }

    public Good() {
        setIdGood(idGood);
    }

    public Good(Long idGood, String category, String nameGood, Person salesman, Double price, Integer quantityGoodsStock) {
        setIdGood(idGood);
        this.category = category;
        this.nameGood = nameGood;
        this.salesman = salesman;
        this.price = price;
        this.quantityGoodsStock = quantityGoodsStock;
    }

    public Long getIdGood() {
        return idGood;
    }

    public void setIdGood(Long idGood) {
        this.idGood = idGood;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNameGood() {
        return nameGood;
    }

    public void setNameGood(String nameGood) {
        this.nameGood = nameGood;
    }

    public Person getSalesman() {
        return salesman;
    }

    public void setSalesman(Person salesman) {
        this.salesman = salesman;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantityGoodsStock() {
        return quantityGoodsStock;
    }

    public void setQuantityGoodsStock(Integer quantityGoodsStock) {
        this.quantityGoodsStock = quantityGoodsStock;
    }
}
