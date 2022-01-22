package com.trusov.mydependencyinjectionstart.example2.di

import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleLocalDataSource
import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSource
import com.trusov.mydependencyinjectionstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return impl
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}