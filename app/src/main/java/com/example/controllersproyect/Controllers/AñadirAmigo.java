package com.example.controllersproyect.Controllers;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AñadirAmigo {
    @FormUrlEncoded
    @POST("relation/add")
    Call<ResponseBody> añadiramigo(
            @Field("principal") String principal,
            @Field("second") String second,
            @Field("type") String type);
}
