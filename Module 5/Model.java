package com.example.myapplication;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Model
{

    @Expose
    @SerializedName("id")
    int id;


    @Expose
    @SerializedName("p_name")
    String p_name;

    @Expose
    @SerializedName("p_price")
    String p_price;

    @Expose

    @SerializedName("p_des")
    String p_des;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public String getP_des() {
        return p_des;
    }

    public void setP_des(String p_des) {
        this.p_des = p_des;
    }
}