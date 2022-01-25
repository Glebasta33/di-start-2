package com.trusov.mydependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleRepository
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleUseCase
import java.lang.RuntimeException
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val useCase: ExampleUseCase,
    private val repository: ExampleRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when (modelClass) {
            ExampleViewModel::class.java -> ExampleViewModel(useCase) as T
            ExampleViewModel2::class.java -> ExampleViewModel2(repository) as T
            else -> throw RuntimeException("Unknown view model class $modelClass")
        }
    }
}