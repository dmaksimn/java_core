package com.raman.lis.task02.darashenka;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private       String       color;
	private final String       model;
	private final String       year;
	private       Double       sizeWhile;
	private final Double       engineVolume;
	private       List<String> optionCarList = new ArrayList<>();

	public Car(String color, String model, String year, Double sizeWhile, Double engineVolume, List<String> optionCarList) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.sizeWhile = sizeWhile;
		this.engineVolume = engineVolume;
		this.optionCarList = optionCarList;
	}

	public Car(String color, String model, String year, Double sizeWhile, Double engineVolume) {
		this.color = color;
		this.model = model;
		this.year = year;
		this.sizeWhile = sizeWhile;
		this.engineVolume = engineVolume;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Double getSizeWhile() {
		return sizeWhile;
	}

	public void setSizeWhile(Double sizeWhile) {
		this.sizeWhile = sizeWhile;
	}

	public List<String> getOptionCarList() {
		return optionCarList;
	}

	public void setOptionCarList(List<String> optionCarList) {
		this.optionCarList = optionCarList;
	}

	@Override
	public String toString() {
		return "Car{" +
			"color='" + color + '\'' +
			", model='" + model + '\'' +
			", year='" + year + '\'' +
			", sizeWhile=" + sizeWhile +
			", engineVolume=" + engineVolume +
			", optionCarList=" + optionCarList +
			'}';
	}
}
