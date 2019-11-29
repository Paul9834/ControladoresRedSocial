package com.example.controllersproyect.Controllers;

import com.example.controllersproyect.Entities.Publications;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Publicaciones {
    @FormUrlEncoded
    @POST("publication/friends/")
    Call<List<Publications>> publications(
            @Field("user") String user);
}
