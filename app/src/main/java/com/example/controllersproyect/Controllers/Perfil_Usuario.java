package com.example.controllersproyect.Controllers;

import com.example.controllersproyect.Entities.Perfil;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Perfil_Usuario {
    @FormUrlEncoded
    @POST("profile")
     Call<List<Perfil>> perfil_usuario(
            @Field("nick") String nick);
}
