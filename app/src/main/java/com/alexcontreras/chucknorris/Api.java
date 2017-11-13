package com.alexcontreras.chucknorris;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by alexh on 10/11/2017.
 */

public interface Api {
    @GET("jokes/random")
    Call<Chistacos> getChistaco();
}
