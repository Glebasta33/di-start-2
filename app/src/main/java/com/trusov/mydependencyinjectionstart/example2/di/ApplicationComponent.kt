package com.trusov.mydependencyinjectionstart.example2.di

import android.content.Context
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {



    fun inject(activity: MainActivity)

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(
            @BindsInstance
            context: Context,
            @BindsInstance
            timestamp: Long
        ):ApplicationComponent
    }
}