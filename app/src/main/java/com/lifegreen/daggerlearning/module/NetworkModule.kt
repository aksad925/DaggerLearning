package com.lifegreen.daggerlearning.module

import com.lifegreen.daggerlearning.remote.LoginRetrofitService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.create

@Module
class NetworkModule {

    @Provides
    fun provideLoginRetrofitService() : LoginRetrofitService{
        return Retrofit.Builder().baseUrl("https://www.google.com")
            .build().create(LoginRetrofitService::class.java)
    }
}