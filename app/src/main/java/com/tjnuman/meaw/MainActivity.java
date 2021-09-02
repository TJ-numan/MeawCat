package com.tjnuman.meaw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView meawtext;
    ImageView meaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meawtext = findViewById(R.id.meawtext);
        meaw = findViewById(R.id.meaw);



        meaw.setOnClickListener(v -> getCatFact());
    }

    private void getCatFact() {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://catfact.ninja/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
            Call<PostModel> call = jsonPlaceHolderApi.getSinglePost();
            call.enqueue(new Callback<PostModel>() {
                @Override
                public void onResponse(Call<PostModel> call, Response<PostModel> response) {
                    if (!response.isSuccessful()){

                    }
                    PostModel postModel = response.body();
                    String content = "";
                    content = "Fact: "+postModel.getFact() + "\n";

                    meawtext.setText(content);
                }

                @Override
                public void onFailure(Call<PostModel> call, Throwable t) {

                    meawtext.setText("Network Error");

                }
            });



    }
}