package com.raman.lis.task03.shafalovich;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Car> carWarehouse = new ArrayList<>();

    Garage() {
        carWarehouse.add(new BmwCar(2020,3, 21,"Blue"));
        carWarehouse.add(new BmwCar(2000,1.8, 19,"Black"));
        carWarehouse.add(new AudiCar(2021,2.5, 20,"White"));
        carWarehouse.add(new AudiCar(2012,2, 16,"Red"));
        carWarehouse.add(new GeelyCar(2010,1.5, 17,"Black"));
        carWarehouse.add(new GeelyCar(2019,2, 18,"Red"));
    }

    public boolean searchCarByOrder(Car car) {
        for (int i = 0; i < carWarehouse.size(); i++){
            if (carWarehouse.get(i).equals(car)) {
                carWarehouse.get(i).setWheelSize(car.getWheelSize());
                carWarehouse.get(i).setColor(car.getColor());
            }
            car = carWarehouse.get(i);
            carWarehouse.remove(i);
            return true;
        }
        carWarehouse.add(car);
        return false;
    }

    public void completedOrder(Car car) {
        System.out.println("\n" + "Машина была изготовлена по вашему заказу!" + "\n" + car);
    }

    @Override
    public String toString(){
        System.out.println("[=======Склад автомобилей=======]");
        StringBuilder b = new StringBuilder();
        int count = 1;
        int iMax = carWarehouse.size() - 1;
        for (int i = 0; ; i++) {
            b.append("\n" + "_________________________________" + "\n" + "Номер авто на складе: " + count
                    + "\n" + "---------------------------------" + "\n");
            count++;
            b.append(String.valueOf(carWarehouse.get(i)));
            if (i == iMax) {
                return b.append(' ').toString();
            }
        }
    }



}
