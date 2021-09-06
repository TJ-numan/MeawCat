package com.tjnuman.meaw;

import com.tjnuman.meaw.breedRes.BreedResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("fact") //https://catfact.ninja/fact
    Call<FactModel> getSinglePost();


    @GET("v1/breeds") //https://api.thecatapi.com/v1/breeds
    Call<List<BreedResponse>> getBreedPost();

//    @POST("posts")
//    Call<PostModel>creatPost(@Body PostModel post);


}
