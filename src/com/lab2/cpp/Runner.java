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
        List<Car> carsFilteredByBrand = CarController.filterCarsByBrand(cars, scanner.nextLine());
        carsFilteredByBrand.forEach(System.out::println);

        System.out.print("Input number of years of exploitation: ");
        List<Car> carsFilteredByExploitationYears = CarController.filterByExploitationYears(cars, Integer.parseInt(scanner.nextLine()));
        carsFilteredByExploitationYears.forEach(System.out::println);

        System.out.print("Input year of manufacture: ");
        Integer year = Integer.parseInt(scanner.nextLine());
        System.out.print("Input price: ");
        List<Car> carsFilteredByYearAndPrice = CarController.filterCarsByYearOfManufactureAndPrice(cars, year, new BigDecimal(scanner.nextLine()));
        carsFilteredByYearAndPrice.forEach(System.out::println);
    }
}






