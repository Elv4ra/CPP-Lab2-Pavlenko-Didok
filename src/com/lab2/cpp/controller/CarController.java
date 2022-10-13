package com.lab2.cpp.controller;

import com.lab2.cpp.entity.Car;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarController {
    public static List<Car> createCarList() throws FileNotFoundException {
        List<Car> carArray = new ArrayList<>();
        File file = new File("cars");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String[] carInfo = scanner.nextLine().split(" ");
            carArray.add(new Car(Long.parseLong(carInfo[0]),
                    carInfo[1],
                    carInfo[2],
                    Integer.parseInt(carInfo[3]),
                    carInfo[4],
                    BigDecimal.valueOf(Long.parseLong(carInfo[5])),
                    carInfo[6]));
        }
        return carArray;
    }

    public static List<Car> filterCarsByBrand(List<Car> cars, String brand) {
        return cars.stream().filter(car -> car.getBrand().equals(brand)).collect(Collectors.toList());
    }

    public static List<Car> filterByExploitationYears(List<Car> cars, Integer yearsInExploitation) {
        return cars.stream().filter(car ->
                Calendar.getInstance().get(Calendar.YEAR) - car.getYearOfManufacture() > yearsInExploitation)
                        .collect(Collectors.toList());
    }

    public static List<Car> filterCarsByYearOfManufactureAndPrice(List<Car> cars, Integer year, BigDecimal price) {
        return cars.stream().filter(car -> car.getYearOfManufacture().equals(year)
                && car.getPrice().compareTo(price) > 0).collect(Collectors.toList());
    }

}
