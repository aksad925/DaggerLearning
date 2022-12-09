package com.lifegreen.daggerlearning

import android.app.Application
import com.lifegreen.daggerlearning.components.ApplicationComponent
import com.lifegreen.daggerlearning.components.DaggerApplicationComponent

class MyApplication : Application() {
    val applicationComponent : ApplicationComponent = DaggerApplicationComponent.create()
}