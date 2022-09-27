package com.jcaldier.felinefriendlyplants.ui.main.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Plant(
    val plantId: Long,
    val commonName: String,
    val aliases: List<String>,
    val scientificName: String,
    val imageUrl: String,
    val description: String,
    val toxicStatus: PlantToxicity
) : Parcelable