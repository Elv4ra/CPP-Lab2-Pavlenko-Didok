package com.lab2.cpp;

import com.lab2.cpp.controller.CarController;
import com.lab2.cpp.entity.Car;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        List<Car> cars = CarController.createCarList();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input brand: ");
        CarController.displayCarsByBrand(cars, scanner.nextLine());

        System.out.print("Input number of years: ");
        CarController.displayByExploitationYears(cars, Integer.parseInt(scanner.nextLine()));

        System.out.print("Input year: ");
        Integer year = Integer.parseInt(scanner.nextLine());
        System.out.print("Input price: ");
        CarController.displayCarsByYearOfManufactureAndPrice(cars, year, new BigDecimal(scanner.nextLine()));
    }
}






