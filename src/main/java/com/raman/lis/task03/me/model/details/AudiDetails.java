package com.raman.lis.task03.me.model.details;

public class AudiDetails extends AbstractDetails {

    private final boolean quartoInstalled;

    public AudiDetails(boolean quartoInstalled) {
        this.quartoInstalled = quartoInstalled;
    }

    public boolean isQuartoInstalled() {
        return quartoInstalled;
    }

}
