package com.alexcontreras.chucknorris;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by alexh on 10/11/2017.
 */

public interface conectarApi {
    @GET("jokes/random")
    Call<Chistacos> getChiste();
}
