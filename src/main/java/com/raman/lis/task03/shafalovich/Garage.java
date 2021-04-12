package com.raman.lis.task03.shafalovich;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Car> carWarehouse = new ArrayList<>();

    Garage() {
        carWarehouse.add(new BmwCar(2020, CarEngines.ENGINE3_0, CarWheels.SIZE_21, CarColors.BLUE));
        carWarehouse.add(new BmwCar(2000, CarEngines.ENGINE2_5, CarWheels.SIZE_19, CarColors.BLACK));
        carWarehouse.add(new AudiCar(2021, CarEngines.ENGINE2_0, CarWheels.SIZE_20, CarColors.WHITE));
        carWarehouse.add(new AudiCar(2012, CarEngines.ENGINE2_0, CarWheels.SIZE_16, CarColors.RED));
        carWarehouse.add(new GeelyCar(2010, CarEngines.ENGINE1_8, CarWheels.SIZE_17, CarColors.BLACK));
        carWarehouse.add(new GeelyCar(2019, CarEngines.ENGINE1_5, CarWheels.SIZE_18, CarColors.RED));
    }

    public void searchCar(Car car) {
        boolean isFound = false;
        for (int i = 0; i < carWarehouse.size(); i++) {
            if (car.equals(carWarehouse.get(i))) {
                carWarehouse.get(i).setWheelSize(car.getWheelSize());
                carWarehouse.get(i).setColor(car.getColor());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            carWarehouse.add(car);
        }
    }

    @Override
    public String toString() {
        System.out.println("[=======Склад автомобилей=======]");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int iMax = carWarehouse.size() - 1;
        for (int i = 0; ; i++) {
            sb.append("\n" + "_________________________________" + "\n" + "Номер авто на складе: " + count
                    + "\n" + "---------------------------------" + "\n");
            count++;
            sb.append(carWarehouse.get(i).toString());
            if (i == iMax) {
                return sb.append(' ').toString();
            }
        }
    }
}
