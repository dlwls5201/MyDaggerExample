package com.example.mydaggerexample.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import com.example.mydaggerexample.R;
import com.example.mydaggerexample.burger.Burger;
import dagger.android.support.DaggerAppCompatActivity;

import javax.inject.Inject;

public class DetailActivity extends DaggerAppCompatActivity {

    @Inject
    Burger burger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("DetailActivity");

        // DaggerBurgerComponent 함수는 필요 없습니다.
        /* DaggerBurgerComponent.builder()
                .build().inject(this);*/

        Log.d("MyTag","DetailActivity burger bun : "
                + burger.bun.getBun() + " , patty : " + burger.patty.getPatty());

    }
}
