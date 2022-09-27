package com.jcaldier.felinefriendlyplants.ui.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.jcaldier.felinefriendlyplants.ui.main.data.Plant

object PlantListDiffUtil : DiffUtil.ItemCallback<Plant>() {
    override fun areItemsTheSame(oldItem: Plant, newItem: Plant): Boolean {
        return oldItem.plantId == newItem.plantId
    }

    override fun areContentsTheSame(oldItem: Plant, newItem: Plant): Boolean {
        return oldItem == newItem
    }

}