package com.jcaldier.felinefriendlyplants.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.jcaldier.felinefriendlyplants.databinding.PlantCardBinding
import com.jcaldier.felinefriendlyplants.ui.main.data.Plant

class PlantListAdapter(
    private val onPlantClick: (plantId: Long) -> Unit
) : ListAdapter<Plant, PlantViewHolder>(PlantListDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PlantCardBinding.inflate(inflater, parent, false)
        return PlantViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        val item = getItem(position)
        holder.onBind(item, onPlantClick)
    }

}