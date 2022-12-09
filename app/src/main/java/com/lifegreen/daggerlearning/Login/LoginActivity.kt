package com.lifegreen.daggerlearning.Login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifegreen.daggerlearning.MyApplication
import com.lifegreen.daggerlearning.R
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    @Inject
    lateinit var loginViewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        ( application as MyApplication).applicationComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}