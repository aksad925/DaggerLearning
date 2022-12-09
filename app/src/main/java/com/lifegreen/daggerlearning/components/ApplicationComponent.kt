package com.lifegreen.daggerlearning.components

import com.lifegreen.daggerlearning.Login.LoginActivity
import com.lifegreen.daggerlearning.module.NetworkModule
import com.lifegreen.daggerlearning.repository.UserRepository
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface ApplicationComponent {
    fun repository(): UserRepository
    fun inject(activity: LoginActivity)
}