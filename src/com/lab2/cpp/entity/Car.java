package com.lab2.cpp.entity;

import java.math.BigDecimal;

public class Car {
    private final long id;
    private final String brand;
    private final String model;
    private final Integer yearOfManufacture;
    private final String color;
    private final BigDecimal price;
    private final String registrationNumber;

    public Car(long id, String brand, String model, Integer yearOfManufacture, String color, BigDecimal price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Car #" + id
                + "\nBrand: " + brand
                + "\nModel: " + model
                + "\nIssue year: " + yearOfManufacture.toString()
                + "\nColor: " + color
                + "\nPrice: " + price
                + "$\nRegistration number: " + registrationNumber + "\n\n";
    }
}