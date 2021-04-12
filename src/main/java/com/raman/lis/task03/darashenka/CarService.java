package com.raman.lis.task03.darashenka;

public class CarService {
		void changeColorCar(Car car, String color) {
			car.setColor(color);
		}

		void changeSizeWheelCar(Car car, int wheels) {
			car.setSizeWheel(wheels);
		}

		void Option(Car car, String string) {
			car.addOption(string);
		}
		void  DeleteOption(Car car, String string) {
			car.deleteOption(string);
		}
}
