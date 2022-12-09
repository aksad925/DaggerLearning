package com.lifegreen.daggerlearning.repository

import com.lifegreen.daggerlearning.local.UserLocalDataSource
import com.lifegreen.daggerlearning.remote.UserRemoteDataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) {


}