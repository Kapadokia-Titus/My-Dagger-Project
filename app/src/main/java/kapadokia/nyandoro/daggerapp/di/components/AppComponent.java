package kapadokia.nyandoro.daggerapp.di.components;

import javax.inject.Singleton;

import dagger.Component;
import kapadokia.nyandoro.daggerapp.MainActivity;
import kapadokia.nyandoro.daggerapp.di.modules.ContextModule;
import kapadokia.nyandoro.daggerapp.di.modules.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class, ContextModule.class})
public interface AppComponent {

    void inject(MainActivity mainActivity);
}