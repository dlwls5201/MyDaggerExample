package com.example.mydaggerexample.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import com.example.mydaggerexample.burger.Burger;
import com.example.mydaggerexample.R;
import com.example.mydaggerexample.di.BurgerComponent;
import com.example.mydaggerexample.di.BurgerModule;
import com.example.mydaggerexample.di.DaggerBurgerComponent;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Burger burger;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("MainActivity");

        BurgerComponent component = DaggerBurgerComponent.builder()
                .burgerModule(new BurgerModule())
                .build();

        component.inject(this);

        Log.d("MyTag","MainActivity burger bun : " + burger.bun.getBun() + " , patty : " + burger.patty.getPatty());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

    }
}



/**
 *  dagger example
 *
 *  이승민님의 블로그
 *  https://medium.com/@maryangmin/di-%EA%B8%B0%EB%B3%B8%EA%B0%9C%EB%85%90%EB%B6%80%ED%84%B0-%EC%82%AC%EC%9A%A9%EB%B2%95%EA%B9%8C%EC%A7%80-dagger2-%EC%8B%9C%EC%9E%91%ED%95%98%EA%B8%B0-3332bb93b4b9
 *
 *  찰스의 안드로이드
 *  https://www.charlezz.com/?p=428
 */