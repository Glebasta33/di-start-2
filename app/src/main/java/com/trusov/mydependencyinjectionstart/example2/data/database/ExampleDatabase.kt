package com.trusov.mydependencyinjectionstart.example2.data.database

import android.content.Context
import android.util.Log
import com.trusov.mydependencyinjectionstart.R
import com.trusov.mydependencyinjectionstart.example2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val timestamp: Long
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} $timestamp")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}