package com.raman.lis.task02.darashenka;

public class CarApplication {

	public static void main(String[] args) {
		Car car = new Car("white", "Bentlee", "1932",21D, 5.1D);

		System.out.println(car);
		car.getOptionCarList().add("Mafon");

		System.out.println(car);
	}
}
