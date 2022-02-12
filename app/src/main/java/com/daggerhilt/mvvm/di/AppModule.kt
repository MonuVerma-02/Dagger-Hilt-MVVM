package com.daggerhilt.mvvm.di

import com.daggerhilt.mvvm.repository.CricketerRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRepository(): CricketerRepositoryImp = CricketerRepositoryImp()
}