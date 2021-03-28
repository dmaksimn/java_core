package com.raman.lis.task02.shafalovich;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Factory {

    private String[] models;
    private String[] colors;
    private double[] engineValues;
    private int[] wheelSizes;

    public ArrayList<Car> carWarehouse = new ArrayList <Car>();

    public Factory(Car... cars) {

        for (int i = 0; i < cars.length; i++) {

            carWarehouse.add(i, cars[i]);
        }
    }

    public void setModels(String... strings) {

        this.models = strings;
    }

    public String[] getModels() {

        return models;
    }

    public void setColors(String... colors) {

        this.colors = colors;
    }

    public String[] getColors() {

        return colors;
    }

    public void setEngineValues(double... engineValues) {

        this.engineValues = engineValues;
    }

    public double[] getEngineValues() {

        return engineValues;
    }

    public void setWheelSizes(int... wheelSizes) {

        this.wheelSizes = wheelSizes;
    }

    public int[] getWheelSizes() {

        return wheelSizes;
    }

    public void doCar (Salon salon, Service service) {

        boolean carEdit = false;

        if (Arrays.stream(models).anyMatch(salon.getOrder().get(0)::equals) &&
                Arrays.stream(engineValues).anyMatch(salon.getOrder().get(4)::equals) &&
                Arrays.stream(colors).anyMatch(salon.getOrder().get(1)::equals) &&
                IntStream.of(wheelSizes).anyMatch(x -> x == (int) salon.getOrder().get(3))) {

            for (int i = 0; i < carWarehouse.size(); i++) {

                if (carWarehouse.get(i).getModel() == (String) salon.getOrder().get(0) &&
                        carWarehouse.get(i).getEngineValue() == (double) salon.getOrder().get(4)) {

                    System.out.println("Исходя из вашего заказа, мы добавили изменения в уже имеющуюся на складе модель " + carWarehouse.get(i).getModel());
                    service.changeCarColor(carWarehouse.get(i),(String)salon.getOrder().get(1));
                    service.addCarOption(carWarehouse.get(i),(String)salon.getOrder().get(5));
                    service.changeCarWheels(carWarehouse.get(i),(int)salon.getOrder().get(3));

                    carEdit = true;
                    break;
                }
            }

            if (!carEdit) {

                System.out.println("Ваш заказ выполнен!");
                if (salon.getOrder().size() < 5) {
                    Car carNew = new Car((String) salon.getOrder().get(0),
                            (String) salon.getOrder().get(1),
                            (int) salon.getOrder().get(2),
                            (double) salon.getOrder().get(4),
                            (int) salon.getOrder().get(3),
                            (String) salon.getOrder().get(5));

                    carWarehouse.add(carNew);
                } else {
                    Car carNew = new Car((String) salon.getOrder().get(0),
                            (String) salon.getOrder().get(1),
                            (int) salon.getOrder().get(2),
                            (double) salon.getOrder().get(4),
                            (int) salon.getOrder().get(3));

                    carWarehouse.add(carNew);
                }
            }
        }

        else System.out.println("Завод не может выполнить ваш заказ!");
    }

    public void showCarInCarWarehouse() {

        for (int i = 0, num = 1; i < carWarehouse.size(); i++, num++) {

            System.out.println("Машина на складе № " + num);
            Car.showCar(carWarehouse.get(i));
            System.out.println("");
        }
    }
}

