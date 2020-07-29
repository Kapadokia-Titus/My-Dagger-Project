package kapadokia.nyandoro.daggerapp.repository;

import javax.inject.Inject;

import io.reactivex.Single;
import kapadokia.nyandoro.daggerapp.model.UserModel;
import kapadokia.nyandoro.daggerapp.remote.UserService;

public class UserRepository {

    private UserService userService;

    @Inject
    public UserRepository(UserService userService) {
        this.userService = userService;
    }

    public Single<UserModel> modelSingle(){
        return userService.getUserModel();
    }
}
