package com.trusov.mydependencyinjectionstart.example2.di

import com.trusov.mydependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}