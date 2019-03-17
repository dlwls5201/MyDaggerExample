package com.example.mydaggerexample;

import com.example.mydaggerexample.di.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().build();
    }
}
