package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Bmw.*;
import java.util.Arrays;

public class CarFactoryBmw extends CarFactory {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear -10;

    public CarFactoryBmw(ServiceColor serviceColor, ServiceWheels serviceWheels,
                         ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        addCarInStorage(new CarBmw(CarColorMercedes.RED, CarModelMercedes.M4, 2020,
                CarSizeWheelsMercedes.LOW_17, CarEngineVolumeMercedes.LOW_2000));
        addCarInStorage(new CarBmw(CarColorMercedes.YELLOW, CarModelMercedes.M5, 2005,
                CarSizeWheelsMercedes.MIDDLE_18, CarEngineVolumeMercedes.MIDDLE_2200));
        addCarInStorage(new CarBmw(CarColorMercedes.BLACK, CarModelMercedes.X6, 2009,
                CarSizeWheelsMercedes.HIGH_20, CarEngineVolumeMercedes.HIGH_3500));
    }

    public Car createCar(CarColorMercedes color, CarModelMercedes model, int yearProduction,
                         CarSizeWheelsMercedes sizeWheels, CarEngineVolumeMercedes engineVolume)
                         throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryBMW in" +
                    " class CarFactoryBmw");
        }
        Car car = compareCarInStorage(color, model, yearProduction, sizeWheels, engineVolume);
        if (car != null) {
            return car;
        } else {
            return new CarBmw(color, model, yearProduction, sizeWheels, engineVolume);
        }
    }

    @Override
    protected void stringAutoOnStorageFactory() {
        System.out.println("Авто на складе завода BMW");
    }

    @Override
    public void printPropertyCar() {
        StringBuilder builder = new StringBuilder();
        builder.append("Вывод списка возможных свойст авто завода BMW" + "\n");
        builder.append("Возможный цвет авто: " + Arrays.toString(CarColorMercedes.values()) + "\n");
        builder.append("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeMercedes.values()) + "\n");
        builder.append("Возможная модель авто: " + Arrays.toString(CarModelMercedes.values()) + "\n");
        builder.append("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsMercedes.values()) + "\n");
        System.out.println(builder);
    }
}

