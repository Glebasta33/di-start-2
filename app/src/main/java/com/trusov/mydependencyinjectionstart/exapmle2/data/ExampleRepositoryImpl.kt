package com.trusov.mydependencyinjectionstart.exapmle2.data

import com.trusov.mydependencyinjectionstart.exapmle2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}