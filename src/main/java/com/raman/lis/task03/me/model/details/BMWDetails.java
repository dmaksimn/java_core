package com.raman.lis.task03.me.model.details;

public class BMWDetails extends AbstractDetails {

    private final boolean mVersion;

    public BMWDetails(boolean mVersion) {
        this.mVersion = mVersion;
    }

    public boolean ismVersion() {
        return mVersion;
    }

}
