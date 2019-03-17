package com.example.mydaggerexample.di;

import com.example.mydaggerexample.burger.BeefPatty;
import com.example.mydaggerexample.burger.Burger;
import com.example.mydaggerexample.burger.WheatBun;
import dagger.Module;
import dagger.Provides;

@Module
public class BurgerModule {

    @Provides
    Burger provideBurger(WheatBun bun, BeefPatty patty) {
        return new Burger(bun, patty);
    }

    @Provides
    WheatBun provideBun() {
        return new WheatBun();
    }

    @Provides
    BeefPatty providePatty() {
        return new BeefPatty();
    }
}
