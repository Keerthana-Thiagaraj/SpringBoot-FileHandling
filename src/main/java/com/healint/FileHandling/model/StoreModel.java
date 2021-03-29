package com.healint.FileHandling.model;

import javax.persistence.*;

@Entity
@Table(name = "STORE_ORDER")
public class StoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORDER_ID", unique = true)
    private String order_id;

    @Column(name = "ORDER_DATE")
    private String order_date;

    @Column(name = "SHIP_DATE")
    private String ship_date;

    @Column(name = "SHIP_MODE")
    private String ship_mode;

    @Column(name = "QUANTITY")
    private int quantity;

    @Column(name = "DISCOUNT")
    private double discount;

    @Column(name = "PROFIT")
    private double profit;

    @Column(name = "PRODUCT_ID", unique = true)
    private String product_id;

    @Column(name = "CUSTOMER_NAME")
    private String customer_name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "CUSTOMER_ID", unique = true)
    private String customer_id;

    @Column(name = "PRODUCT_NAME")
    private String product_name;

    @Lob
    private byte[] fileData;

    public StoreModel(Long id, String order_id, String order_date, String ship_date, String ship_mode,
                      String customer_id, String customer_name, String segment, String country, String city,
                      String state, String postal_code, String region, String product_id, String category, String s, String product_name,
                      String sales, String quantity, String discount, String profit) {

    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getShip_date() {
        return ship_date;
    }

    public void setShip_date(String ship_date) {
        this.ship_date = ship_date;
    }

    public String getShip_mode() {
        return ship_mode;
    }

    public void setShip_mode(String ship_mode) {
        this.ship_mode = ship_mode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }
}
