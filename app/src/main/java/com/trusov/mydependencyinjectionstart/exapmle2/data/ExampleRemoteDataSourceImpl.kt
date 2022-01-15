package com.trusov.mydependencyinjectionstart.exapmle2.data

class ExampleRemoteDataSourceImpl(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {

    }
}