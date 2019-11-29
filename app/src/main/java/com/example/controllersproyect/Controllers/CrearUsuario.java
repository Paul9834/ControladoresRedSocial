package com.example.controllersproyect.Controllers;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CrearUsuario {
    @FormUrlEncoded
    @POST("user/create")
    Call<ResponseBody> createuser(
            @Field("nick") String nick,
            @Field("active") String active,
            @Field("role") String role);
}
