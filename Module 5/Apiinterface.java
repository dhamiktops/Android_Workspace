package com.example.myapplication;


import android.telecom.Call;

import java.util.List;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Apiinterface
{
    @FormUrlEncoded
    @POST("mobileproductinsert.php")
    Call<Model> savedetail(
            @Field("p_name") String product_name,
            @Field("p_price") String product_price,
            @Field("p_des") String product_description

    );

    @GET("mobileview.php")
    Call<List<Model>> viewdetail();

    @FormUrlEncoded
    @POST("mobiledelete.php")
    Call<Model> deletedetail( @Field("id") int id );

    @FormUrlEncoded
    @POST("mobileupdate.php")
    Call<Model> updatedetail(
            @Field("id") String id,
            @Field("p_name") String product_name,
            @Field("p_price") String product_price,
            @Field("p_des") String product_description

    );

}