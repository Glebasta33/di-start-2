package com.trusov.mydependencyinjectionstart.example2.data.datasource

import android.util.Log
import javax.inject.Inject

class TestingRemoteDataSourceImpl @Inject constructor() : ExampleRemoteDataSource {
    override fun method() {
        Log.d("TestingDataSource", "test")
    }
}