package com.example.controllersproyect.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.controllersproyect.ClientRetrofit.RetrofitClient;
import com.example.controllersproyect.Entities.Perfil;
import com.example.controllersproyect.Entities.Publications;
import com.example.controllersproyect.R;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Retrofit();

        tx = findViewById(R.id.texto);

        RetrofitPerfilUsuario();


    }


    private void RetrofitCreateProfile () {
        Call<ResponseBody> call = RetrofitClient.getInstance().getCrearPerfil().createprofile

                ("dsadsa",
                "true" ,
                "estudiante",
                "google.com",
                "true",
                "true",
                "hombre");


        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String s = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void RetrofitCreateUser () {
        Call<ResponseBody> call = RetrofitClient.getInstance().getCrearUsuario().createuser

                ("dsadsa",
                 "true",
                 "estudiante");


        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {

                    String respuesta = response.body().string();

                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void RetrofitPublications() {


        Call<List<Publications>> call = RetrofitClient.getInstance().getPublicaciones().publications("Paul9834");


        call.enqueue(new Callback<List<Publications>>() {
            @Override
            public void onResponse(Call<List<Publications>> call, retrofit2.Response<List<Publications>> response) {

                Log.e("TAG", response.code() + "");
                List<Publications> lista = response.body();

                for (Publications e : lista) {
                    String content = "";
                    content += "User ID: " + e.getText() + "\n";
                    tx.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Publications>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_LONG).show();
            }
        });

    }
    private void RetrofitAnadirAmigo () {

        Call<ResponseBody> call = RetrofitClient.getInstance().getAñadirAmigo().añadiramigo(
                "dsadsa",
                        "true",
                        "estudiante");

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {

                    String respuesta = response.body().string();

                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void RetrofitPerfilUsuario() {
        Call<List<Perfil>> call = RetrofitClient.getInstance().getPerfilUsuario().perfil_usuario("Paul9834");
        call.enqueue(new Callback<List<Perfil>>() {
            @Override
            public void onResponse(Call<List<Perfil>> call, retrofit2.Response<List<Perfil>> response) {
                Log.e("TAG", response.code() + "");
                List<Perfil> lista = response.body();
                for (Perfil e : lista) {
                    String content = "";
                    content += "Nombre " + e.getName() + "\n";
                    content += "User ID: " + e.getId() + "\n";
                    content += "Descripcion: " + e.getDescription() + "\n";
                    tx.append(content);
                }
            }
            @Override
            public void onFailure(Call<List<Perfil>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error.", Toast.LENGTH_LONG).show();
            }
        });
    }




}
