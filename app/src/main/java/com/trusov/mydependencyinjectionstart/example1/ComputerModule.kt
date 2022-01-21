package com.trusov.mydependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    // тут важно явно указать тип возвращаемого значения
    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

}