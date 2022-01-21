package com.trusov.mydependencyinjectionstart.example2.data.repository

import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}