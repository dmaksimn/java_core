package com.raman.lis.task03.dubroushchyk;

//звёздочка потому-что мне все Enum константы из этих package надо
import com.raman.lis.task03.dubroushchyk.Enum.Audi.*;
import java.util.Arrays;

public class CarFactoryAudi extends CarFactory {

    private int currentYear = 2021;
    private int minYearForCreateCar = currentYear - 10;

    public CarFactoryAudi(ServiceColor serviceColor, ServiceWheels serviceWheels,
                          ServiceOptional serviceOptional) {
        super(serviceColor, serviceWheels, serviceOptional);

        addCarInStorage(new CarAudi(CarColorAudi.WHITE, CarModelAudi.A4,
                2016, CarSizeWheelsAudi.Low, CarEngineVolumeAudi.LOW_VOLUME));
        addCarInStorage(new CarAudi(CarColorAudi.PINK, CarModelAudi.A6,
                2018, CarSizeWheelsAudi.MIDDLE, CarEngineVolumeAudi.MIDDLE_VOLUME));
        addCarInStorage(new CarAudi(CarColorAudi.BLACK, CarModelAudi.A8,
                2020, CarSizeWheelsAudi.HIGH, CarEngineVolumeAudi.HIGH_VOLUME));
    }

    public Car createCar(CarColorAudi color, CarModelAudi model, int yearProduction,
                         CarSizeWheelsAudi sizeWheels, CarEngineVolumeAudi engineVolume)
                         throws IllegalArgumentException {
        if (yearProduction > currentYear || yearProduction < minYearForCreateCar) {
            throw new IllegalArgumentException("Illegal value yearProduction for carFactoryAudi in" +
                    " class CarFactoryAudi");
        }
        Car car = compareCarInStorage(color, model, yearProduction, sizeWheels, engineVolume);
        if (car != null) {
            return car;
        } else {
            return new CarAudi(color, model, yearProduction, sizeWheels, engineVolume);
        }
    }

    @Override
    protected void stringAutoOnStorageFactory () {
        System.out.println("Авто на складе завода Audi");
    }
    @Override
    public void printPropertyCar () {
        StringBuilder builder = new StringBuilder();
        builder.append("Вывод списка возможных свойст авто завода Audi" + "\n");
        builder.append("Возможный цвет авто: " + Arrays.toString(CarColorAudi.values()) + "\n");
        builder.append("Возможный объём двигателя: " + Arrays.toString(CarEngineVolumeAudi.values()) + "\n");
        builder.append("Возможная модель авто: " + Arrays.toString(CarModelAudi.values()) + "\n");
        builder.append("Возможный размер дисков: " + Arrays.toString(CarSizeWheelsAudi.values()) + "\n");
        System.out.println(builder);
    }
}