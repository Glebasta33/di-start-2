package com.trusov.mydependencyinjectionstart.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.trusov.mydependencyinjectionstart.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider
// Как сделать, чтоб viewModelFactory был синглтоном, но не сами ViewModel?
@ApplicationScope
class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<String, Provider<ViewModel>> // Provider - обёртка (будет возращяться один и тот же, а ViewModel будут создаваться новые)
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return viewModelProviders[modelClass.simpleName]?.get() as T
    }
}