package com.raman.lis.task03.darashenka;

import java.util.Arrays;
import java.util.Objects;

public class Car {

	private String color;
	private final String brand;
	private final int year;
	private int sizeWheels;
	private final int engineVolume;
	private String[] option = new String[0];

	public Car(String color, String brand, int year, int sizeWheels,
			   int engineVolume) {
		this.color = color;
		this.brand = brand;
		this.year = year;
		this.sizeWheels = sizeWheels;
		this.engineVolume = engineVolume;
	}

	void addOption(String string) {
		String[] array = Arrays.copyOf(option, option.length + 1);
		option = array;
		option[option.length - 1] = string;
	}

	void  deleteOption(String string) {
		for (int i = 0; i < option.length; i++) {
			if (option[i].equalsIgnoreCase(string)) {
				for (int j = 0; j < option.length; j++) {
					option[i] = option[i +1];
				}
				String[] array = Arrays.copyOf(option, option.length - 1);
				option = array;
			}
		}
	}

	void  setColor(String color) {
		this.color = color;
	}

	public void setSizeWheel(int sizeWheels) {
		this.sizeWheels = sizeWheels;
	}

		void  PrintCar() {
			System.out.println("Color of car: " + color);
			System.out.println("Brand of car: " + brand);
			System.out.println("Year of car: " + year);
			System.out.println("Size wheel of car: " + sizeWheels);
			System.out.println("Engine volume of car: " + engineVolume);
			if (option.length >= 1) {
				System.out.println("Option list: " + Arrays.toString(option));
			}
			else {
				System.out.println("Option list: no option");
			}
	}

	public String toString() {
		return "Color of car: " + color + '\n' +
		 "Brand of car: " + brand + '\n' +
		 "Year of car: " + year + '\n' +
		 "Size wheel of car: " + sizeWheels + '\n' +
		 "Engine volume of car: " + engineVolume + '\n' +
				'\n';
		}

		public boolean equals(Object o) {
		if (this == o)
			return true;
			if (o == null || getClass() != o.getClass())
				return false;
				Car car = (Car) o;
				return year == car.year &&
						sizeWheels == car.sizeWheels &&
						engineVolume == car.engineVolume &&
						Objects.equals(color, car.color) &&
						Objects.equals(brand, car.brand) &&
						Arrays.equals(option, car.option);
			}
		}
