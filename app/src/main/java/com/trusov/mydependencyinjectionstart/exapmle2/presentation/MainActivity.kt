package com.trusov.mydependencyinjectionstart.exapmle2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trusov.mydependencyinjectionstart.R
import com.trusov.mydependencyinjectionstart.example1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.keyboard.toString()
        activity.mouse.toString()
        activity.monitor.toString()
    }
}