package com.trusov.mydependencyinjectionstart.example2.data.network

import android.content.Context
import android.util.Log
import com.trusov.mydependencyinjectionstart.R
import com.trusov.mydependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timestamp: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timestamp $this")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}