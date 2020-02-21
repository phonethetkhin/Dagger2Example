package com.example.dagger2example;

import javax.inject.Inject;

public class Stark implements House {

    @Inject
    public Stark() {

    }

    @Override
    public void prepareforWar() {
        System.out.println(this.getClass().getSimpleName()+" Preparing for War");
    }

    @Override
    public void reportforWar() {
        System.out.println(this.getClass().getSimpleName()+" Reporting");

    }
}
