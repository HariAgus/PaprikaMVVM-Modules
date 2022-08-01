package com.haw.domain.repository

import com.haw.domain.model.Coin

interface CoinRepository {

    suspend fun getCoins(): List<Coin>

}