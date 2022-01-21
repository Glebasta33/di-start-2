package com.trusov.mydependencyinjectionstart.example2.data.datasource

import com.trusov.mydependencyinjectionstart.example2.data.network.ExampleApiService

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}