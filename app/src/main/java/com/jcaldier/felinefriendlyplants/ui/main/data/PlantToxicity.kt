package com.jcaldier.felinefriendlyplants.ui.main.data

import android.os.Parcelable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.jcaldier.felinefriendlyplants.R
import kotlinx.parcelize.Parcelize

sealed class PlantToxicity(
    @DrawableRes val toxicitySymbol: Int,
    @StringRes val stringRes: Int,
) : Parcelable {

    @Parcelize
    object NonToxic : PlantToxicity(
        toxicitySymbol = R.drawable.ic_non_toxic_status,
        stringRes = R.string.non_toxic_plants,
    )

    @Parcelize
    object MildlyToxic : PlantToxicity(
        toxicitySymbol = R.drawable.ic_mildly_toxic_status,
        stringRes = R.string.mildly_toxic_plants,
    )

    @Parcelize
    object Toxic : PlantToxicity(
        toxicitySymbol = R.drawable.ic_toxic_status,
        stringRes = R.string.toxic_plants,
    )

}