package kapadokia.nyandoro.daggerapp;

import android.app.Application;

import kapadokia.nyandoro.daggerapp.di.components.AppComponent;
import kapadokia.nyandoro.daggerapp.di.components.DaggerAppComponent;


public class BaseApplication extends Application {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent= DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}