package com.cainwong.metronome;

import android.app.Application;
import android.content.Context;

import com.cainwong.metronome.dagger.AppComponent;
import com.cainwong.metronome.dagger.AppModule;
import com.cainwong.metronome.dagger.DaggerAppComponent;

public class App extends Application {

    private AppComponent component;

    public static  AppComponent component(Context context){
        return ((App) context.getApplicationContext()).component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

}
