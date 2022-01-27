package com.trusov.mydependencyinjectionstart.example2.di

import android.content.Context
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

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