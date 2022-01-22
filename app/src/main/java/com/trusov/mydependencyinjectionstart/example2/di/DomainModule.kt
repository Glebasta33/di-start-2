package com.trusov.mydependencyinjectionstart.example2.di

import com.trusov.mydependencyinjectionstart.example2.data.repository.ExampleRepositoryImpl
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}