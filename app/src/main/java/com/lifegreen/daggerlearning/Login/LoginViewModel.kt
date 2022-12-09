package com.lifegreen.daggerlearning.Login

import com.lifegreen.daggerlearning.repository.UserRepository
import javax.inject.Inject

class LoginViewModel @Inject constructor(private val userRepository: UserRepository) {
}