package com.raman.lis.task03.dubroushchyk;

public abstract class CarService implements IService {

    @Override
    public void methodInAllSubclassCarService() {
        System.out.println("\nЧисто метод для проверки\n");
    }
}
