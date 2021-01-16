/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author turtle
 */
public class Car implements Serializable{
    private String id;    // Số Khung
    private String name;  // Tên Xe
    private String brand; // Hãng
    private float price;  // Giá
    private String color; // mầu Xe
    private int seat;    // chỗ ngồi
    private String year;  // Năm Sản Xuất

    public Car() {
    }

    public Car(String id, String name, String brand,
            float price, String color, int seat, String year) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.seat = seat;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
}
