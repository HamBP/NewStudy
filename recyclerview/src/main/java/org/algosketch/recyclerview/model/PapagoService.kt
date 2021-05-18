package org.algosketch.recyclerview.model

import retrofit2.Call
import retrofit2.http.*

interface PapagoService {
    @FormUrlEncoded
    @POST("n2mt")
    fun requestTranslation(@Header("X-Naver-Client-Id")clientID: String = Configs.clientID,
                           @Header("X-Naver-Client-Secret")apiKey: String = Configs.apiKey,
                           @Field("source")fromLang: String = "en",
                           @Field("target")toLang: String = "ko",
                           @Field("text")text: String? = "this is android") : Call<PapagoEntity>
}