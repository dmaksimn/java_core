package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Mercedes.*;
import java.util.Arrays;

public class CarFactoryMercedes extends CarFactory {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear - 10;

    public CarFactoryMercedes(ServiceColor serviceColor, ServiceWheels serviceWheels,
                              ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        addCarInStorage(new CarMercedes(CarColorMercedes.BLACK,CarModelMercedes.E200,
                2020, CarSizeWheelsMercedes.Low, CarEngineVolumeMercedes.LOW_VOLUME));
        addCarInStorage(new CarMercedes(CarColorMercedes.ORANGE, CarModelMercedes.SLR,
                2005, CarSizeWheelsMercedes.MIDDLE, CarEngineVolumeMercedes.MIDDLE_VOLUME));
        addCarInStorage(new CarMercedes(CarColorMercedes.GREY,CarModelMercedes.GL,
                2020, CarSizeWheelsMercedes.HIGH, CarEngineVolumeMercedes.HIGH_VOLUME));
    }

    public Car createCar(CarColorMercedes color, CarModelMercedes model, int yearProduction,
                         CarSizeWheelsMercedes sizeWheels, CarEngineVolumeMercedes engineVolume)
                         throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryAudi in" +
                    " class CarFactoryAudi");
        }
        Car car = compareCarInStorage(color, model, yearProduction, sizeWheels, engineVolume);
        if (car != null) {
            return car;
        } else {
            return new CarMercedes(color, model, yearProduction, sizeWheels, engineVolume);
        }
    }

    @Override
    protected void stringAutoOnStorageFactory() {
        System.out.println("Авто на складе завода Mercedes");
    }

    @Override
    public void printPropertyCar() {
        StringBuilder builder = new StringBuilder();
        builder.append("Вывод списка возможных свойст авто завода Mercedes" + "\n");
        builder.append("Возможный цвет авто: " + Arrays.toString(CarColorMercedes.values()) + "\n");
        builder.append("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeMercedes.values()) + "\n");
        builder.append("Возможная модель авто: " + Arrays.toString(CarModelMercedes.values()) + "\n");
        builder.append("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsMercedes.values()) + "\n");
        System.out.println(builder);
    }
}
