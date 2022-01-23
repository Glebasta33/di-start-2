package com.trusov.mydependencyinjectionstart.example2.di

import android.content.Context
import com.trusov.mydependencyinjectionstart.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DomainModule::class, DataModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

    @Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun putContextIntoDagger(context: Context): ApplicationComponentBuilder

        fun buildMyComponent(): ApplicationComponent
    }
}