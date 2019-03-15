package com.example.mydaggerexample.di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class AppModule {

    @Provides
    @Named("appContext")
    @Singleton
    Context provideContext(Application application) {
        return application.getApplicationContext();
    }

}
