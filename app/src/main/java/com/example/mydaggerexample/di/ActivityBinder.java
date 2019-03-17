package com.example.mydaggerexample.di;

import com.example.mydaggerexample.ui.DetailActivity;
import com.example.mydaggerexample.ui.MainActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract public class ActivityBinder {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector
    abstract DetailActivity bindDetailActivity();
}
