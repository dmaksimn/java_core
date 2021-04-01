package com.raman.lis.task03.dubroushchyk;

public abstract class CarService implements IService {
    @Override
    public void metodInAllSubclassCarService(Car car, int wheels) {
        System.out.println("\nЧисто метод для проверки\n");
    }
}
