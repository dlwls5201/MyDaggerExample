package com.example.mydaggerexample.di;

import android.app.Application;
import com.example.mydaggerexample.MyApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

// 대거의 안드로이드 지원 모듈인 AndroidSupportInjectionModule 을 함께 추가합니다.
@Component(modules = {
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<MyApplication> {

    // AppComponent 를 생성할 때 사용할 빌더 클래스를 정의합니다.
    @Component.Builder
    interface Builder {

        // @BindsInstance 어노테이션으로 객체 그래프에 추가할 객체를 선언합니다.
        // 객체 그래프에 추가할 객체를 인자로 받고, 빌더 클래스를 반환하는 함수 형태로 선언합니다.
        @BindsInstance
        Builder application(Application app);

        // 빌더 클래스는 컴포넌트를 반환하는 build() 함수를 반드시 포함해야 합니다.
        AppComponent build();
    }
}
