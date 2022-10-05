package com.jcaldier.felinefriendlyplants.ui.main.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class MainViewState : Parcelable {

    object Loading : MainViewState()

    object Error : MainViewState()

    data class Content(
        val appliedFilters: List<PlantToxicity>,
        val plantList: List<Plant>
    ) : MainViewState()

}