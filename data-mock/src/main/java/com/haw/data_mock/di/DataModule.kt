package com.haw.data_mock.di

import com.haw.data_mock.repository.CoinRepositoryImpl
import com.haw.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideCoinRepository(): CoinRepository = CoinRepositoryImpl()

}
