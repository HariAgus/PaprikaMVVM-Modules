package com.haw.data.repository

import com.haw.data.api.CoinPaprikaApi
import com.haw.data.extentions.toCoin
import com.haw.domain.model.Coin
import com.haw.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi,
) : CoinRepository {

    override suspend fun getCoins(): List<Coin> {
        return api.getCoins().map {
            it.toCoin()
        }
    }

}