package com.trusov.mydependencyinjectionstart.example2.di

import com.trusov.mydependencyinjectionstart.example2.data.datasource.*
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ExampleRemoteDataSourceQualifier
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestingRemoteDataSourceQualifier
    @Binds
    fun bindTestingRemoteDataSource(impl: TestingRemoteDataSourceImpl): ExampleRemoteDataSource
}