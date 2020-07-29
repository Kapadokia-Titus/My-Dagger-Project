package kapadokia.nyandoro.daggerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import javax.inject.Inject;

import kapadokia.nyandoro.daggerapp.databinding.ActivityMainBinding;
import kapadokia.nyandoro.daggerapp.model.UserModel;
import kapadokia.nyandoro.daggerapp.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    private UserViewModel userViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        ((BaseApplication) getApplication()).getAppComponent().inject(this);

        userViewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel.class);
        userViewModel.getModelMutableLiveData().observe(this, new Observer<UserModel>() {
            @Override
            public void onChanged(UserModel userModel) {
                binding.setUser(userModel);
            }
        });
    }
}