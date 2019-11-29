package com.example.controllersproyect.Controllers;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface CrearPerfil {
    @FormUrlEncoded
    @POST("profile/create")
    Call<ResponseBody> createprofile(
            @Field("id") String id,
            @Field("name") String name,
            @Field("last") String last,
            @Field("url") String url,
            @Field("description") String description,
            @Field("onLocation") String onLocation,
            @Field("gender") String gender);
}
