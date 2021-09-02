package com.tjnuman.meaw;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("fact") //https://catfact.ninja/fact
    Call<PostModel> getSinglePost();

//    @POST("posts")
//    Call<PostModel>creatPost(@Body PostModel post);


}
