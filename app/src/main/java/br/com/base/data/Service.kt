package br.com.base.data

import io.reactivex.Single
import retrofit2.Response
import retrofit2.http.GET

interface Service {
    @GET("character")
    fun getCharacters(): Single<Response<Any>>
}