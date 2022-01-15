package com.trusov.mydependencyinjectionstart.exapmle2.domain

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}