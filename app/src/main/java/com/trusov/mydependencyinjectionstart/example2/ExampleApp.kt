package com.trusov.mydependencyinjectionstart.example2

import android.app.Application
import com.trusov.mydependencyinjectionstart.example2.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }

}