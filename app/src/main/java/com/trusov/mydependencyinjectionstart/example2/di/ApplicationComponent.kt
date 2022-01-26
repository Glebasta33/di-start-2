package com.trusov.mydependencyinjectionstart.example2.di

import android.content.Context
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DomainModule::class, DataModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)

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