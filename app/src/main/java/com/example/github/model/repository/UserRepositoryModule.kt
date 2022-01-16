package com.example.github.model.repository

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class UserRepositoryModule {

    /**
     * [UserRepository]のDIに用いられるインスタンスを生成して返す
     */
    @Provides
    fun provideUserRepository(userRepositoryImpl: UserRepositoryImpl): UserRepository {
       return userRepositoryImpl
    }
}