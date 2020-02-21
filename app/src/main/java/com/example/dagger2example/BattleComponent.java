package com.example.dagger2example;


import dagger.Component;

@Component(modules = BraavoModule.class)
public interface BattleComponent {
    War getWar();
    Cash getCash();
    Soldier getSoldier();

}

