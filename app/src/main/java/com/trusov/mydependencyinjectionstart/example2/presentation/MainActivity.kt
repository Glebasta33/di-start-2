package com.trusov.mydependencyinjectionstart.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.trusov.mydependencyinjectionstart.R
import com.trusov.mydependencyinjectionstart.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory()
            .create("MY_ID")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tv_hello_world).setOnClickListener {
            Intent(this, MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
        viewModel.method()
        viewModel2.method()
    }
}