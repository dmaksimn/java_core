package com.raman.lis.task03.me.model.details;

import java.util.HashSet;

public abstract class AbstractDetails {

    private HashSet<String> options;

    public HashSet<String> getOptions() {
        return options;
    }

    public void setOptions(HashSet<String> options) {
        this.options = options;
    }

}
