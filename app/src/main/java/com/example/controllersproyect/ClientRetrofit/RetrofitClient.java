package com.example.controllersproyect.ClientRetrofit;

import com.example.controllersproyect.Controllers.AñadirAmigo;
import com.example.controllersproyect.Controllers.CrearPerfil;
import com.example.controllersproyect.Controllers.CrearUsuario;
import com.example.controllersproyect.Controllers.Perfil_Usuario;
import com.example.controllersproyect.Controllers.Publicaciones;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "http://www.paul9834.engineer/";
    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized RetrofitClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public Publicaciones getPublicaciones() {
        return retrofit.create(Publicaciones.class);
    }
    public CrearUsuario getCrearUsuario() {
        return retrofit.create(CrearUsuario.class);
    }
    public CrearPerfil getCrearPerfil() {
        return retrofit.create(CrearPerfil.class);
    }
    public AñadirAmigo getAñadirAmigo() {
        return retrofit.create(AñadirAmigo.class);
    }
    public Perfil_Usuario getPerfilUsuario () {
        return retrofit.create(Perfil_Usuario.class);
    }

}
