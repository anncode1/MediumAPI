package com.anncode.mediumapi.mediumApi;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by anahisalgado on 20/06/17.
 */

public interface Service {
    @GET(Constants.URL_GET_USER)
    Call<JsonObject> getDataUser();

}
