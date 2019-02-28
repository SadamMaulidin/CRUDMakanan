package com.example.crudmakanan.Data.Remote;

import com.example.crudmakanan.Model.Login.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    //membuat endpoint login
    @FormUrlEncoded
    @POST("loginuser.php")
    Call<LoginResponse> loginUser(
            @Field("username")String username,
            @Field("password")String password
    );

}
