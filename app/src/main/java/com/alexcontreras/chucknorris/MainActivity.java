package com.alexcontreras.chucknorris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MainActivity extends AppCompatActivity implements Callback<Chistacos> {

    public TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.chucknorris.io/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        conectarApi request = retrofit.create(conectarApi.class);
        Call<Chistacos> call = request.getChiste();
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<Chistacos> call, Response<Chistacos> response) {
        if(response.isSuccessful()) {
            Chistacos chiste = response.body();
            text.setText(chiste.getValue());
        } else {
            text.setText("Error");
        }
    }

    @Override
    public void onFailure(Call<Chistacos> call, Throwable t) {
        t.printStackTrace();
    }
}
