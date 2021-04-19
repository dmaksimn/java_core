package com.raman.lis.task03.grigorovich.service;


import com.raman.lis.task03.grigorovich.model.Car;

public interface AdditionalOptionsServiceInterface {

    void addAdditionalOptions(Car car, String addOption);

    void removeAdditionalOptions(Car car, String removeOption);
}
