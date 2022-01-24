package com.trusov.mydependencyinjectionstart.example2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trusov.mydependencyinjectionstart.R
import com.trusov.mydependencyinjectionstart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component by lazy {
        DaggerApplicationComponent.factory()
            .create(application, System.currentTimeMillis())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}