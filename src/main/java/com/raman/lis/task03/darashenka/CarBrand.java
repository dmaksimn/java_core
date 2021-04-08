package com.raman.lis.task03.darashenka;

public enum CarBrand {
    Audi("Audi"),
    Bmw("BMW"),
    Citroen("Citroen"),
    Dacia("Dacia"),
    Lincoln("Lincoln"),
    ;
    private String string;

    CarBrand(String string) {
        this.string = string;
    }

    public String getBrand() {
        return string;
    }
}
