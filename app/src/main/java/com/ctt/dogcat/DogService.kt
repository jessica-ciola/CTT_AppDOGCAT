package com.ctt.dogcat

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET
import retrofit2.http.Path

interface DogService {

     @GET("1")

     fun buscarDog() : Call<Dog>

}