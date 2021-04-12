package com.raman.lis.task02.shafalovich;

import java.util.ArrayList;

public class Salon {

    private ArrayList<Object> order = new ArrayList<Object>();

    public void setOrder(Object... objects){

        order.clear();
        for (int i = 0; i < objects.length; i++) {

            order.add(i, objects[i]);
        }
    }

    public ArrayList<Object> getOrder() {

        return order;
    }
}
