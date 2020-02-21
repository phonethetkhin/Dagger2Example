package com.example.dagger2example;

import dagger.Module;
import dagger.Provides;

@Module
public class BraavoModule {
    Cash cash;
    Soldier soldier;

    public BraavoModule(Cash cash, Soldier soldier) {
        this.cash = cash;
        this.soldier = soldier;
    }
    @Provides
    Cash ProvideCash()
    {
        return cash;
    }
    @Provides
    Soldier ProvideSoldier()
    {
        return soldier;
    }
}
