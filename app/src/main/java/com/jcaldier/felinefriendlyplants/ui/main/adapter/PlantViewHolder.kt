package com.jcaldier.felinefriendlyplants.ui.main.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.jcaldier.felinefriendlyplants.R
import com.jcaldier.felinefriendlyplants.databinding.PlantCardBinding
import com.jcaldier.felinefriendlyplants.ui.main.data.Plant

class PlantViewHolder(
    private val binding: PlantCardBinding
) : ViewHolder(binding.root) {

    fun onBind(plant: Plant, onClick: (plantId: Long) -> Unit) {
        binding.commonPlantName.text = plant.commonName
        binding.scientificPlantName.text = plant.scientificName
        binding.toxicStatusSymbol.setImageResource(plant.toxicStatus.toxicitySymbol)
        binding.plantAliases.text = plant.aliases.joinToString(separator = ", ")
        binding.readMoreButton.setOnClickListener {
            onClick(plant.plantId)
        }
        // TODO load image
        Glide.with(itemView.context).load(plant.imageUrl)
            .placeholder(R.color.placeholder_teal)
            .fallback(R.color.placeholder_teal)
            .into(binding.plantImage)

    }

}
