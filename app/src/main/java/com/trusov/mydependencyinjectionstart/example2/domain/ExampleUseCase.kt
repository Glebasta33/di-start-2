package com.trusov.mydependencyinjectionstart.example2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}