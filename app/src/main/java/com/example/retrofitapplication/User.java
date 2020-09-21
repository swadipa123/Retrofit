package com.example.retrofitapplication;

import com.google.gson.annotations.SerializedName;

public class User {

    private String login;
    private int id;
    private String node_id;

    @SerializedName("avatar_url") //this is json name (original name in api)
    private String url;   //this is changed name for convenience

    public String getLogin() {
        return login;
    }

    public int getId() {
        return id;
    }

    public String getNode_id() {
        return node_id;
    }

    public String getUrl() {
        return url;
    }
}
