package com.raman.lis.task02.popov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car_Salon extends Auto_Factory {

    Car orderCar(int colour, int model, int sizeWheels, int volumeEngine, int option) throws IOException{
        for (int i = 0; i < storage.size(); i++) {
            if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).model.equals(listModel.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))
                    && (storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))) {
                return storage.get(i);
            } else if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).model.equals(listModel.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                } else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine,option);
                }
            } else if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))
                    && (storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                } else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine, option);
                }
            } else if ((storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))
                    && (storage.get(i).model.equals(listColour.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                }else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine, option);
                }
            }
        }
        return createCar(colour, model, sizeWheels, volumeEngine, option);
    }


    Car orderCar(int colour, int model, int sizeWheels, int volumeEngine) throws IOException {
        for (int i = 0; i < storage.size(); i++) {
            if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).model.equals(listModel.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))
                    && (storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))) {
                return storage.get(i);
            } else if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).model.equals(listModel.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                } else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine);
                }
            } else if ((storage.get(i).colour.equals(listColour.get(colour - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))
                    && (storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                } else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine);
                }
            } else if ((storage.get(i).volumeEngine == (listVolumeEngine.get(volumeEngine - 1)))
                    && (storage.get(i).model.equals(listColour.get(model - 1)))
                    && (storage.get(i).sizeWheels == (listSizeWheels.get(sizeWheels - 1)))) {
                if (printOfferWithChoice(storage.get(i)).equals("Да")) {
                    System.out.println("Спасибо, что приняли наше предложение: ");
                    return storage.get(i);
                }else {
                    System.out.println("Только под вас была сорана эта машина! ");
                    createCar(colour, model, sizeWheels, volumeEngine);
                }
            }
        }
        return createCar(colour, model, sizeWheels, volumeEngine);
    }

    String printOfferWithChoice(Car car) throws IOException {
        System.out.println("В наличии есть схожее предложение: ");
        car.printCharacteristicCar(car);
        System.out.println();
        System.out.println("Вы заинтересованы?(Да/Нет)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }
}
