package kapadokia.nyandoro.daggerapp.di.modules;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import kapadokia.nyandoro.daggerapp.di.ViewModelKey;
import kapadokia.nyandoro.daggerapp.viewmodel.UserViewModel;
import kapadokia.nyandoro.daggerapp.viewmodel.ViewModelFactory;

@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(UserViewModel.class)
    abstract ViewModel bindViewModel(UserViewModel userViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindFactory(ViewModelFactory viewModelFactory);
}
