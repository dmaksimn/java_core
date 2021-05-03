package com.TaskCar;

public class CarSalon {
      private CarFabric fabric;
      private CarService service;

      CarSalon(CarFabric fabric, CarService service) {
              this.fabric = fabric;
              this.service = service;
      }

      Car createCarFabric(CarColor color, CarBrand brand, int year, CarSizeWheels sizeWheels, CarEngineVolume engineVolume) {
              return fabric.createCar(color.getColor(), brand.getBrand(), year, sizeWheels.getSizeWheels(), engineVolume.getVolume());
      }

      Car carFromFabricStorage(int number) {
          return fabric.carFromStorage(number);
      }

      void changeServiceColor(Car car, String color) {
          service.changeColorCar(car, color);
      }

      void  changeServiceWheels(Car car, int wheels) {
          service.changeSizeWheelCar(car, wheels);
      }

      void addServiceOption(Car car, String string) {
          service.Option(car, string);
      }

      void  deleteServiceOption(Car car, String string) {
          service.DeleteOption(car, string);
      }
}
