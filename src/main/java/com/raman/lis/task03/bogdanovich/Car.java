package com.raman.lis.task03.bogdanovich;

abstract class Car {
    String color;
    String model;
    int year;
    int wheelSize;
    float engineVol;

    Car (String color, String model, int year, int wheelSize,
          float engineVol) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
}

     //добавить авто на склад
    abstract void addCar (String color, String model, int year, int wheelSize,
                          float engineVol);
}

class AllCar extends Car {
    AllCar (String color, String model, int year, int wheelSize,
           float engineVol){
        super (color, model, year, wheelSize, engineVol);
    }
    void addCar (String color, String model, int year, int wheelSize,
                 float engineVol) {
        super.color = color;
        super.model = model;
        super.year = year;
        super.wheelSize = wheelSize;
        super.engineVol = engineVol;
    }

    String setColor (String color) {
        this.color = color;
        return color;
    }

    public boolean equals (Car car) {
        return (this.year == year) && (this.engineVol == engineVol);
    }

    @Override
    public String toString() {
        return "Модель: " + model + " Цвет: " + color + " Год выпуска: " +
                year + " Диаметр дисков: " + wheelSize + " Объем двигателя: " +engineVol+"\n";
    }

    String getModel () {
        return model;
    }

    float getEngineVol () {
        return engineVol;
    }

    int getYear () {
        return year;
    }

    int setWheel (int wheel) {
        this.wheelSize = wheel;
        return wheel;
    }

    public void printCar () {
        System.out.println("Модель: " + model+ " Цвет: " + color + " Год выпуска: " +
                year + " Диаметр дисков: "+ wheelSize + " Объем двигателя: " +engineVol);
    }
}
