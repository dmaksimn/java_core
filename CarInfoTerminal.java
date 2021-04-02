package com.TaskCar;

public class CarInfoTerminal {
		public static void main (String... args) {
			CarService service = new CarService();
			CarFabric fabric = new CarFabric(service);
			CarSalon salon = new CarSalon(fabric, service);
			fabric.storageInfo();
			Car car1 = salon.createCarFabric(CarColor.WHITE, CarBrand.Dacia, 2021, CarSizeWheels.Medium, CarEngineVolume.Low);

			car1.PrintCar();
			fabric.storageInfo();
			Car car2 = salon.carFromFabricStorage(2);
			fabric.storageInfo();
			car2.PrintCar();
			salon.changeServiceColor(car2, "Red");
			car2.PrintCar();
			car1.setColor("Black");
			car2.setSizeWheel(22);
			car1.addOption("Climate control");
			car2.addOption("Adaptive cruise control");
			car1.PrintCar();
			car2.PrintCar();
		}
}