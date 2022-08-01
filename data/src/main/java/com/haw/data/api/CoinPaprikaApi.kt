package com.haw.data.api

import com.haw.data.model.CoinModel
import retrofit2.http.GET

interface CoinPaprikaApi {

    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinModel>

}