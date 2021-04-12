package com.raman.lis.task03.mihnevich.services.impl;

import com.raman.lis.task03.mihnevich.cars.Car;
import com.raman.lis.task03.mihnevich.services.OptionService;

import java.util.ArrayList;
import java.util.List;

public class OptionServiceImpl extends OptionService {
    @Override
    public void addOption(Car car, String option) {
        if (car != null) {
            List<String> options = car.getOptions();
            if (options == null) {
                options = new ArrayList<>();
            }
            if (!options.contains(option)) {
                options.add(option);
                car.setOptions(options);
            }
        }
    }

    @Override
    public void deleteOption(Car car, String option) {
        if (car != null) {
            List<String> options = new ArrayList<>(car.getOptions());
            if (options != null && options.contains(option)) {
                options.remove(option);
                car.setOptions(options);
            }
        }

    }
}
