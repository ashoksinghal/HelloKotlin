package com.academy.hellojava;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

public class MyModel {

    @SerializedName("fields")
    HashMap<String, JsonObject> map;

    public HashMap<String, JsonObject> getMap() {
        return map;
    }

    public void setMap(HashMap<String, JsonObject> map) {
        this.map = map;
    }
}
