package com.example.dagger2example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BattleofBastards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battleof_bastards);

        //Manual DI

        /*IronBank ironBank=new IronBank();
        Allies allies=new Allies(ironBank);

        Stark stark=new Stark(allies,ironBank);
        Bolton bolton=new Bolton(allies,ironBank);

        War war=new War(stark,bolton);

        war.prepareforWar();
        war.reportForWar();*/

        //Using Dagger 2

        Cash cash=new Cash();
        Soldier soldier=new Soldier();

        BattleComponent component=DaggerBattleComponent
                                .builder()
                                .braavoModule(new BraavoModule(cash,soldier))
                                .build();

        War war=component.getWar();
        war.prepareforWar();
        war.reportForWar();

        component.getCash();
        component.getSoldier();

    }
}
