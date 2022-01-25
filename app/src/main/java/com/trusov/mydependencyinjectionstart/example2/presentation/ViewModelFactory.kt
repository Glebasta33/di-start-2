package com.trusov.mydependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.trusov.mydependencyinjectionstart.example2.domain.ExampleUseCase
import java.lang.RuntimeException
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val useCase: ExampleUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass == ExampleViewModel::class.java){
            return ExampleViewModel(useCase) as T
        } else {
            throw RuntimeException("Unknown view model class $modelClass")
        }
    }
}