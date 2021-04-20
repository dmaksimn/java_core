package com.Task.Task07.CarFabric;

import com.Task.Task07.CarConstructor.Car;
import com.Task.Task07.CarConstructor.CarOpel;
import com.Task.Task07.CarEnum.*;
import com.Task.Task07.CarInterface.CarFabricInterface;
import com.Task.Task07.CarService.ServiceChangeColor;
import com.Task.Task07.CarService.ServiceOptions;
import com.Task.Task07.CarService.ServiceChangeWheel;

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
    System.out.println("Display enum");
    System.out.println("Available car color: " + Arrays.toString(CarColor.values()));
    System.out.println("Available car body: " + Arrays.toString(CarBody.values()));
    System.out.println("Available car model: " + Arrays.toString(CarModel.values()));
    System.out.println("Available car size wheels: " + Arrays.toString(CarSizeWheels.values()));
    System.out.println("Available car engine volume: " + Arrays.toString(CarEngineVolume.values()));
  }

  public abstract Car getCarFromStorage(int number);

}