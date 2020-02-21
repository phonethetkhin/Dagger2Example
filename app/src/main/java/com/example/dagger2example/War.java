package com.example.dagger2example;

import javax.inject.Inject;

public class War {
    private Stark stark;
    private Bolton bolton;

    @Inject
    public War(Stark stark, Bolton bolton) {
        this.stark = stark;
        this.bolton = bolton;
    }
    public void prepareforWar()
    {
        stark.prepareforWar();
        bolton.prepareforWar();
    }
    public void reportForWar()
    {
        stark.reportforWar();
        bolton.reportforWar();
    }
}
