package kapadokia.nyandoro.daggerapp.remote;


import io.reactivex.Single;
import kapadokia.nyandoro.daggerapp.model.UserModel;
import retrofit2.http.GET;

public interface UserService {

    @GET("/users/3")
    Single<UserModel> getUserModel();
}
