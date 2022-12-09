package com.lifegreen.daggerlearning.remote

import javax.inject.Inject

class UserRemoteDataSource @Inject constructor(private val loginRetrofitService: LoginRetrofitService) {
}