package com.trusov.mydependencyinjectionstart.example2.data.repository

import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.trusov.mydependencyinjectionstart.example2.data.mapper.ExampleMapper
import com.trusov.mydependencyinjectionstart.example2.di.ExampleRemoteDataSourceQualifier
import com.trusov.mydependencyinjectionstart.example2.di.TestingRemoteDataSourceQualifier
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ExampleRemoteDataSourceQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}