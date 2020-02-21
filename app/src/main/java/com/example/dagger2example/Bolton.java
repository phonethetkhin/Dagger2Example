package com.example.dagger2example;

import javax.inject.Inject;

public class Bolton implements House {

@Inject
    public Bolton() {

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
