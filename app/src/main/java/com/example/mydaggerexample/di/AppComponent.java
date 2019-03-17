package com.example.mydaggerexample.di;

import com.example.mydaggerexample.MyApplication;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

import javax.inject.Singleton;

@Singleton
@Component(
        modules = {
                BurgerModule.class,
                ActivityBinder.class,
                AndroidSupportInjectionModule.class
        }
)
public interface AppComponent extends AndroidInjector<MyApplication> {

}
