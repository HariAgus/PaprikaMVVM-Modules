package com.haw.data.extentions

import com.haw.data.model.CoinModel
import com.haw.domain.model.Coin

fun CoinModel.toCoin(): Coin {
    return Coin(
        id, isActive, name, rank, symbol
    )
}