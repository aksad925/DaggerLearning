package com.lifegreen.daggerlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lifegreen.daggerlearning.components.ApplicationComponent
import com.lifegreen.daggerlearning.repository.UserRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}