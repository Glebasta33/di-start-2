package com.trusov.mydependencyinjectionstart.example2.presentation

import com.trusov.mydependencyinjectionstart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase()
    }
}