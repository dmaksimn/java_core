package com.raman.lis.task03.mihnevich.client;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.cars.Model;
import com.raman.lis.task03.mihnevich.cars.validator.CarValidator;
import com.raman.lis.task03.mihnevich.salon.Salon;

import java.util.*;
import java.util.stream.Collectors;

public class GetMostSuitableCarAction implements CarAction {
    @Override
    public Car run() {
        System.out.println("Введите модель машины которую вы хотите получить: ");
        Model[] models = Model.values();
        System.out.println("Доступные модели машин: ");
        for (Model model : models) {
            System.out.print(model.getValue() + ", ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String modelInput = sc.nextLine();
        boolean isCorrectModel = Arrays.stream(models)
                .map(model -> model.getValue().toUpperCase(Locale.ROOT))
                .collect(Collectors.toList())
                .contains(modelInput.toUpperCase(Locale.ROOT));
        Model model;
        if (isCorrectModel) {
            model = Model.valueOf(modelInput.toUpperCase(Locale.ROOT));
        } else {
            System.out.println("Данной модели нет на складе: " + modelInput);
            return null;
        }
        System.out.println("Введите цвет: ");
        List<String> availableModelColors = CarValidator.getAvailableModelColors(model);
        System.out.println("Доступные цвета для данной модели: " + availableModelColors);
        String colorInput = sc.next();
        System.out.println("Введите год: ");
        int yearInput = sc.nextInt();
        System.out.println("Введите размер колес: ");
        List<Integer> availableModelWheelSizes = CarValidator.getAvailableModelWheelSizes(model);
        System.out.println("Доступные размеры колес: " + availableModelWheelSizes);
        Integer wheelSizeInput = sc.nextInt();
        System.out.println("Введите объём двигателя: ");
        List<Double> availableModelEngineVolumes = CarValidator.getAvailableModelEngineVolumes(model);
        System.out.println("Доступные объёмы двигателей: " + availableModelEngineVolumes);
        double engineVolumesInput = sc.nextDouble();
        System.out.println("Введите список опций через пробел: ");
        List<String> optionsInput = new ArrayList<>();
        sc.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(sc.nextLine());
        while (stringTokenizer.hasMoreElements()) {
            optionsInput.add(stringTokenizer.nextToken());
        }
        Salon salon = new Salon();
        Car carOrder;
        try {
            carOrder = salon.getMostSuitableCar(colorInput, optionsInput, model, yearInput, wheelSizeInput, engineVolumesInput);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
        System.out.println("Машина получена");
        return carOrder;
    }
}
