package com.raman.lis.task03.popov.service;

import java.util.Arrays;
import java.util.LinkedList;

abstract public class Service implements IndustryService {
    private final String[] arrayOption = {"LCD - display", "Leather of car","Electric mirror",
            "Conditioner", "Add airbag", "Anti-fog lamp"};

    private LinkedList<String> listOption = new LinkedList<>(Arrays.asList(arrayOption));

    public LinkedList<String> getListOption(){
        return listOption;
    }
}