package com.trusov.mydependencyinjectionstart.example2.di

import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}