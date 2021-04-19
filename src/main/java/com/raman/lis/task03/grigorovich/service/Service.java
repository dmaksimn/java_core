package com.raman.lis.task03.grigorovich.service;

public abstract class Service implements ServiceInterface {

    @Override
    public void infoAboutService() {
        System.out.println("Unknown information about this service");
    }

}
