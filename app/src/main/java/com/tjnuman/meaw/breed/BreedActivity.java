package com.tjnuman.meaw.breed;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

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
    TextView breedText;

    private RecyclerView recyclerView;
    private BreedAdapter adapter;
    private Toolbar toolbar;
    private ArrayList<BreedResponse> arrayList;
    String name,description,lifespan,origin;

    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breed);
        breedText = findViewById(R.id.breedtext);

        getCatBreed();

        toolbar = findViewById(R.id. breedToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Search your Breed here");


         arrayList = new ArrayList<>();



        recyclerView = findViewById(R.id.breedRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BreedAdapter(this,arrayList);

        recyclerView.setAdapter(adapter);







    }

    private void getCatBreed() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.thecatapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);
        Call<ArrayList<BreedResponse>> call = jsonPlaceHolderApi.getBreedPost();
        call.enqueue(new Callback<ArrayList<BreedResponse>>() {
            @Override
            public void onResponse(@NonNull Call<ArrayList<BreedResponse>> call, @NonNull Response<ArrayList<BreedResponse> > response) {
                if (!response.isSuccessful()) {
                 //   breedText.setText(response.code());
                    return;

                }

                List<BreedResponse> postModels = response.body();
                for (BreedResponse postModel : Objects.requireNonNull(postModels)) {

                    String content = "";

                name =  postModel.getName();
                origin = "Origin: " + postModel.getOrigin();
                 lifespan = "Life Span: " + postModel.getLifeSpan()+" years";
                description = "Description: " + postModel.getDescription();
                if(postModel.getImage() != null){
                    url = "image_url: " + postModel.getImage().getUrl() + "\n\n\n";
                   // arrayList.add(new BreedResponse(postModel.getName(),postModel.getOrigin(),postModel.getLifeSpan(),postModel.getDescription(),postModel.getImage().getUrl()));
                }

                breedText.append(name+"\n"+origin+"\n"+lifespan+"\n"+description+"\n"+url);
                arrayList.add(new BreedResponse(name,origin,lifespan,description));
                    adapter.notifyDataSetChanged();


                }
            }

            @Override
            public void onFailure(@NonNull Call<ArrayList<BreedResponse>> call, @NonNull Throwable t) {

               // breedText.setText(t.getMessage());
                Log.d("my_res", "onFailure: error: "+t.getMessage());

            }


        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.search_menu,menu);

        MenuItem menuItem=menu.findItem(R.id.search_id);
        android.widget.SearchView searchView=(android.widget.SearchView) MenuItemCompat.getActionView(menuItem);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

        return true;
    }
}