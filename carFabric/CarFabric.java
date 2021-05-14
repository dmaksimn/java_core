package com.Task.Task07.carFabric;

import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceChangeWheel;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.carConstructor.Car;
import com.Task.Task07.carConstructor.CarOpel;
import com.Task.Task07.carInterface.CarFabricInterface;
import com.Task.Task07.carProperties.*;

import java.util.Arrays;

public abstract class CarFabric implements CarFabricInterface {

  public CarFabric (ServiceChangeColor serviceColor, ServiceChangeWheel serviceChangeWheel
  , ServiceOptions serviceOptions) {
  }

  public Car createCar(CarColor color, CarBody body, CarModel model, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
      return new CarOpel(color, body, model, 2015, sizeWheels, engineVolume);
  }

  public void storageInfo() {
    System.out.println("");
  }

  public void printPropertyCar() {
    String printPropertyCar = "\tAvailable car accessories\n" +
            "\tAvailable car color: " + Arrays.toString(CarColor.values()) + '\n' +
            "\tAvailable car body: " + Arrays.toString(CarBody.values()) + '\n' +
            "\tAvailable car model: " + Arrays.toString(CarModel.values()) + '\n' +
            "\tAvailable car size wheels: " + Arrays.toString(CarSizeWheels.values()) + '\n' +
            "\tAvailable car engine volume: " + Arrays.toString(CarEngineVolume.values()) + '\n';
    System.out.println(printPropertyCar);
  }

  public abstract Car getCarFromStorage(int number);
}