package domain;

public class Good {
    private Long idGood;
    private String category;
    private String nameGood;
    private String salesman;
    private Double price;
    private Integer quantityGoodsStock;

    {
        idGood = 0L;
        category = "Not Selected";
        nameGood = "Good";
        salesman = "company";
        price = 0.1;
        quantityGoodsStock = 1;
    }

    public Good() {
        setIdGood(idGood);
    }

    public Good(Long idGood, String category, String nameGood, String salesman,
                Double price, Integer quantityGoodsStock) {
        this.idGood = idGood;
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
        this.nameGood += nameGood;
    }

    public String getSalesman() {
        return salesman;
    }

    public void setSalesman(String salesman) {
        this.salesman += salesman;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Good)) return false;

        Good good = (Good) o;

        if (getIdGood() != null ? !getIdGood().equals(good.getIdGood()) : good.getIdGood() != null) return false;
        if (getCategory() != null ? !getCategory().equals(good.getCategory()) : good.getCategory() != null)
            return false;
        if (getNameGood() != null ? !getNameGood().equals(good.getNameGood()) : good.getNameGood() != null)
            return false;
        if (getSalesman() != null ? !getSalesman().equals(good.getSalesman()) : good.getSalesman() != null)
            return false;
        if (getPrice() != null ? !getPrice().equals(good.getPrice()) : good.getPrice() != null) return false;
        return getQuantityGoodsStock() != null ? getQuantityGoodsStock().equals(good.getQuantityGoodsStock()) : good.getQuantityGoodsStock() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdGood() != null ? getIdGood().hashCode() : 0;
        result = 31 * result + (getCategory() != null ? getCategory().hashCode() : 0);
        result = 31 * result + (getNameGood() != null ? getNameGood().hashCode() : 0);
        result = 31 * result + (getSalesman() != null ? getSalesman().hashCode() : 0);
        result = 31 * result + (getPrice() != null ? getPrice().hashCode() : 0);
        result = 31 * result + (getQuantityGoodsStock() != null ? getQuantityGoodsStock().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Good{" +
                "idGood=" + idGood +
                ", category='" + category + '\'' +
                ", nameGood='" + nameGood + '\'' +
                ", salesman='" + salesman + '\'' +
                ", price=" + price +
                ", quantityGoodsStock=" + quantityGoodsStock +
                '}';
    }
}
