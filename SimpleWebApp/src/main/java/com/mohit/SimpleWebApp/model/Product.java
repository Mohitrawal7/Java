package com.mohit.SimpleWebApp.model;



import org.springframework.stereotype.Component;

//@AllArgsConstructor
//@Data
@Component
public class Product {

    private int prodId;
    private String prodName;
    private  int price;


    public Product() {
    }

    public Product(int prodId, String prodName, int price) {
        this.price = price;
        this.prodName = prodName;
        this.prodId = prodId;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
