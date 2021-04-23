package com.raman.lis.task04.shafalovich;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        ZergsArmy zergsArmy = new ZergsArmy();
        TerransArmy terransArmy = new TerransArmy();
        ProtossArmy protossArmy = new ProtossArmy();

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(6);
        ScheduledFuture<?> factoryCreateDetails = executor.scheduleAtFixedRate(factory, 1, 100, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> zergsArmyGetDetails = executor.scheduleAtFixedRate(zergsArmy, 2, 200, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> terransArmyGetDetails = executor.scheduleAtFixedRate(terransArmy, 3, 300, TimeUnit.MILLISECONDS);
        ScheduledFuture<?> protossArmyGetDetails = executor.scheduleAtFixedRate(protossArmy, 4, 400, TimeUnit.MILLISECONDS);

        Runnable stop = new Runnable() {
            @Override
            public void run() {
                if (zergsArmy.armySize == 20 || terransArmy.armySize == 20 || protossArmy.armySize == 20) {
                    factoryCreateDetails.cancel(false);
                    zergsArmyGetDetails.cancel(false);
                    terransArmyGetDetails.cancel(false);
                    protossArmyGetDetails.cancel(false);
                    executor.shutdown();
                } else {
                    executor.schedule(this, 10, TimeUnit.SECONDS);
                }
            }
        };
        executor.schedule(stop, 10, TimeUnit.SECONDS);
    }
}
