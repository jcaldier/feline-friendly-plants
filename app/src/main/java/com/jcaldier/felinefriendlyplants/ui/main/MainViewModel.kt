package com.jcaldier.felinefriendlyplants.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jcaldier.felinefriendlyplants.ui.main.data.MainViewState
import com.jcaldier.felinefriendlyplants.ui.main.data.MockDataHelper
import com.jcaldier.felinefriendlyplants.ui.main.data.PlantToxicity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _state: MutableStateFlow<MainViewState> = MutableStateFlow(MainViewState.Loading)
    val state: Flow<MainViewState> = _state

    init {
        loadContent()
    }

    fun loadContent() {
        viewModelScope.launch(Dispatchers.IO) {
            // TODO replace with real implementation
            _state.update { MainViewState.Loading }
            val plantList = listOf(
                MockDataHelper.aloe,
                MockDataHelper.waxPlant,
                MockDataHelper.spiderPlant,
                MockDataHelper.caeroba
            )
            val selectedFilters = emptyList<PlantToxicity>()
            _state.update { MainViewState.Content(selectedFilters, plantList) }
        }
    }

    fun changeFiltering(newFilters: List<PlantToxicity>) {
        viewModelScope.launch(Dispatchers.IO) {
            // TODO replace with real implementation
            _state.update { MainViewState.Loading }
            val plantList = listOf(
                MockDataHelper.aloe,
                MockDataHelper.waxPlant,
                MockDataHelper.spiderPlant,
                MockDataHelper.caeroba
            ).filter { plant ->
                newFilters.contains(plant.toxicStatus)
            }

            _state.update { MainViewState.Content(newFilters, plantList) }
        }
    }

}