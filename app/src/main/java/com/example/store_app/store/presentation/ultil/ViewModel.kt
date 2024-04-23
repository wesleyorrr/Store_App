package com.example.store_app.store.presentation.ultil

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.store_app.util.EventBus
import kotlinx.coroutines.launch

fun ViewModel.sendEvent(event: Any) {
    viewModelScope.launch {
        EventBus.sendEvent(event)
    }
}