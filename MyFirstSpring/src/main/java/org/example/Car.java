package org.example;

public class Car {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public Car() {
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
