package com.raman.lis.task03.bedareva;

public interface OptionChangable {

    boolean addOptionToList(Car car, Option newOption);

    boolean deleteOptionFromList(Car car, Option option);
}
