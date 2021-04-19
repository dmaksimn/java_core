package com.raman.lis.task03.shafalovich;

import com.raman.lis.task03.shafalovich.enums.CarColors;
import com.raman.lis.task03.shafalovich.enums.CarEngines;
import com.raman.lis.task03.shafalovich.enums.CarWheels;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Car> carWarehouse = new ArrayList<>();

    public Garage() {
        carWarehouse.add(new BmwCar(2020, CarEngines.ENGINE3_0, CarWheels.SIZE_21, CarColors.BLUE));
        carWarehouse.add(new BmwCar(2000, CarEngines.ENGINE2_5, CarWheels.SIZE_19, CarColors.BLACK));
        carWarehouse.add(new AudiCar(2021, CarEngines.ENGINE2_0, CarWheels.SIZE_20, CarColors.WHITE));
        carWarehouse.add(new AudiCar(2012, CarEngines.ENGINE2_0, CarWheels.SIZE_16, CarColors.RED));
        carWarehouse.add(new GeelyCar(2010, CarEngines.ENGINE1_8, CarWheels.SIZE_17, CarColors.BLACK));
        carWarehouse.add(new GeelyCar(2019, CarEngines.ENGINE1_5, CarWheels.SIZE_18, CarColors.RED));
    }

    public Car carSelection(Car car) {
        for (int i = 0; i < carWarehouse.size(); i++) {
            Car garageCar = carWarehouse.get(i);
            if (garageCar.equals(car)) {
                garageCar.setWheelSize(car.getWheelSize());
                garageCar.setColor(car.getColor());
                carWarehouse.remove(i);
                return garageCar;
            }
        }
        return car;
    }

    public Car getCar(int numberOfCar) {
        return carWarehouse.get(numberOfCar);
    }

    @Override
    public String toString() {
        System.out.println("[=======Склад автомобилей=======]");
        StringBuilder sb = new StringBuilder();
        int count = 1;
        int iMax = carWarehouse.size() - 1;
        for (int i = 0; ; i++) {
            sb.append("\n_________________________________")
                    .append("\n\tНомер авто на складе: ").append(count)
                    .append("\n---------------------------------")
                    .append("\n");
            count++;
            sb.append(carWarehouse.get(i).toString());
            if (i == iMax) {
                return sb.append(' ').toString();
            }
        }
    }
}
