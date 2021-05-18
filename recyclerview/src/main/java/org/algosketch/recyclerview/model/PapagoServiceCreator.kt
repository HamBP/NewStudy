package org.algosketch.recyclerview.model

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class PapagoServiceCreator {
    val BASE_URL = "https://openapi.naver.com/v1/papago/" // JSON 출력

    fun create() : PapagoService {
        return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(PapagoService::class.java)
    }
}