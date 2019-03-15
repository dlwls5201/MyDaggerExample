package com.example.mydaggerexample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.example.mydaggerexample.burger.Burger;
import com.example.mydaggerexample.R;
import com.example.mydaggerexample.di.BurgerComponent;
import com.example.mydaggerexample.di.BurgerModule;
import com.example.mydaggerexample.di.DaggerBurgerComponent;

import javax.inject.Inject;

public class DetailActivity extends AppCompatActivity {

    @Inject
    Burger burger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DetailActivity");

        BurgerComponent component = DaggerBurgerComponent.builder()
                .burgerModule(new BurgerModule())
                .build();

        component.inject(this);

        Log.d("MyTag","DetailActivity burger bun : " + burger.bun.getBun() + " , patty : " + burger.patty.getPatty());

    }
}
