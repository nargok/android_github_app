package com.example.github.model.remote_data_source

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi

/**
 * [ApiClient]のModule
 */
@Module
@InstallIn(SingletonComponent::class)
class ApiClientModule {
    @ExperimentalSerializationApi
    @Provides
    @Singleton
    fun provideApiClient(apiClientProvider: ApiClientProvider): ApiClient {
        return apiClientProvider.provide()
    }
}