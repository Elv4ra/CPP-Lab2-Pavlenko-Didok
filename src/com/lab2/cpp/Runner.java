package com.lab2.cpp;

import com.lab2.cpp.entity.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class Runner {
    private static final List<Car> cars = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        createCarList();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input brand: ");
        displayCarsByBrand(scanner.nextLine());
        System.out.print("Input number of years: ");
        displayByExploitationYears(Integer.parseInt(scanner.nextLine()));
        System.out.print("Input year: ");
        Integer year = Integer.parseInt(scanner.nextLine());
        System.out.print("Input price: ");
        displayCarsByYearOfManufactureAndPrice(year, new BigDecimal(scanner.nextLine()));
    }

    private static void createCarList() throws FileNotFoundException {
        File file = new File("cars");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] carInfo = scanner.nextLine().split(" ");
            cars.add(new Car(Long.parseLong(carInfo[0]),
                    carInfo[1],
                    carInfo[2],
                    Integer.parseInt(carInfo[3]),
                    carInfo[4],
                    BigDecimal.valueOf(Long.parseLong(carInfo[5])),
                    carInfo[6]));
        }
    }

    private static void displayCarsByBrand(String brand) {
        cars.forEach(car -> {
            if (car.getBrand().equals(brand)) {
                System.out.print(car);
            }
        });
    }

    private static void displayByExploitationYears(Integer yearsInExploitation) {
        cars.forEach(car -> {
            if (Calendar.getInstance().get(Calendar.YEAR) - car.getYearOfManufacture() > yearsInExploitation) {
                System.out.print(car);
            }
        });
    }

    private static void displayCarsByYearOfManufactureAndPrice(Integer year, BigDecimal price) {
        cars.forEach(car -> {
            if (car.getYearOfManufacture().equals(year)
                    && car.getPrice().compareTo(price) > 0) {
                System.out.print(car);
            }
        });
    }
}






