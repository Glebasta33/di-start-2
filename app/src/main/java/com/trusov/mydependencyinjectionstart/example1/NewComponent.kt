package com.trusov.mydependencyinjectionstart.example1

import dagger.Component

@Component
interface NewComponent {

    fun getKeyboard(): Keyboard

    fun inject(activity: Activity)
}