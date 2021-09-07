package com.tjnuman.meaw.breed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.tjnuman.meaw.JsonPlaceHolderApi;
import com.tjnuman.meaw.R;
import com.tjnuman.meaw.breed.breedRes.BreedAdapter;
import com.tjnuman.meaw.breed.breedRes.BreedResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BreedActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BreedAdapter adapter;
    private Toolbar toolbar;
    private ArrayList<BreedResponse> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed);

        toolbar = findViewById(R.id.breedingToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search your Breed here");

         arrayList = new ArrayList<>();

        recyclerView = findViewById(R.id.breedingrecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BreedAdapter(this,arrayList);

        recyclerView.setAdapter(adapter);



         getCatBreed();



    }

    private void getCatBreed() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.thecatapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<List<BreedResponse>> call = jsonPlaceHolderApi.getBreedPost();
        call.enqueue(new Callback<List<BreedResponse>>() {
            @Override
            public void onResponse(@NonNull Call<List<BreedResponse>> call, @NonNull Response<List<BreedResponse> > response) {
                if (!response.isSuccessful()) {
                    //breedText.setText(response.code());
                    return;

                }

                List<BreedResponse> postModels = response.body();
                for (BreedResponse postModel : Objects.requireNonNull(postModels)) {

                    String content = "";
//                content += "Image: " + postModel.getImage() + "\n";
                content += "Name: " + postModel.getName() + "\n";
                content += "Origin: " + postModel.getOrigin() + "\n";
                content += "Life Span: " + postModel.getLifeSpan() + "\n";
                content += "Description: " + postModel.getDescription() + "\n\n\n\n";
               // breedText.append(content);
//                if(postModel.getImage().getUrl() != null){
//
//                    content += "image_url: " + postModel.getImage().getUrl() + "\n\n";
//
//
//                }

            }
            }

            @Override
            public void onFailure(@NonNull Call<List<BreedResponse>> call, @NonNull Throwable t) {

               // breedText.setText(t.getMessage());
                Log.d("my_res", "onFailure: error: "+t.getMessage());

            }


        });





    }
}