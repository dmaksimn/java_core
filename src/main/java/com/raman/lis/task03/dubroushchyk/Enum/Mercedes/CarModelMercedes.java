package com.raman.lis.task03.dubroushchyk.Enum.Mercedes;

public enum CarModelMercedes {
    E200("Mercedes E200"),
    SLR("Mercedes SLR"),
    GL("Mercedes GL");

    private String model;

    CarModelMercedes(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
