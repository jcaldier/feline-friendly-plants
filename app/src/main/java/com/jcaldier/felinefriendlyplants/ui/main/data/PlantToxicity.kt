package com.jcaldier.felinefriendlyplants.ui.main.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import com.jcaldier.felinefriendlyplants.R
import kotlinx.parcelize.Parcelize

sealed class PlantToxicity(@DrawableRes val toxicitySymbol: Int) : Parcelable {

    @Parcelize
    object NonToxic : PlantToxicity(R.drawable.ic_non_toxic_status)

    @Parcelize
    object MildlyToxic : PlantToxicity(R.drawable.ic_mildly_toxic_status)

    @Parcelize
    object Toxic : PlantToxicity(R.drawable.ic_toxic_status)

}