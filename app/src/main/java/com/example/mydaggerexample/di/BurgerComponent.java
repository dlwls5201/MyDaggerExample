package com.example.mydaggerexample.di;

import com.example.mydaggerexample.ui.DetailActivity;
import com.example.mydaggerexample.ui.MainActivity;
import dagger.Component;

@Component(modules = BurgerModule.class)
public interface BurgerComponent {

    void inject(MainActivity activity);

    void inject(DetailActivity activity);
}
