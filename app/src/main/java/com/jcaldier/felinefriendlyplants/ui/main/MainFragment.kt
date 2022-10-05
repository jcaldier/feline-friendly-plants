package com.jcaldier.felinefriendlyplants.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.jcaldier.felinefriendlyplants.databinding.FragmentMainBinding
import com.jcaldier.felinefriendlyplants.ui.main.adapter.PlantListAdapter
import com.jcaldier.felinefriendlyplants.ui.main.data.MainViewState
import com.jcaldier.felinefriendlyplants.ui.main.data.Plant
import com.jcaldier.felinefriendlyplants.ui.main.data.PlantToxicity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment() {

    private val viewModel: MainViewModel by viewModels()

    private var _binding: FragmentMainBinding? = null
    private val binding: FragmentMainBinding
        get() = _binding!!

    private val plantAdapter = PlantListAdapter(::onPlantClicked)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.plantList.adapter = plantAdapter

        initView()
        observeStates()
    }

    private fun initView() {
        binding.errorRefreshButton.setOnClickListener {
            viewModel.loadContent()
        }

        binding.filtersGroup.setOnCheckedStateChangeListener { _, checkedIds ->
            onFilterChipClicked(checkedIds)
        }
    }

    private fun observeStates() {
        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            viewModel.state.collect {
                when (it) {
                    is MainViewState.Content -> showContent(it.appliedFilters, it.plantList)
                    MainViewState.Error -> showError()
                    MainViewState.Loading -> showLoading()
                }
            }
        }
    }

    private fun showContent(appliedFilters: List<PlantToxicity>, plantList: List<Plant>) {
        plantAdapter.submitList(plantList)
        binding.mildlyToxicChip.isChecked =
            appliedFilters.contains(PlantToxicity.MildlyToxic)
        binding.nonToxicChip.isChecked =
            appliedFilters.contains(PlantToxicity.NonToxic)
        binding.toxicChip.isChecked = appliedFilters.contains(PlantToxicity.Toxic)
        binding.errorLayout.visibility = View.GONE
        binding.contentLayout.visibility = View.VISIBLE
    }

    private fun showError() {
        binding.contentLayout.visibility = View.GONE
        binding.errorLayout.visibility = View.VISIBLE
    }

    private fun showLoading() {
        // TODO
    }

    private fun onFilterChipClicked(checkedIds: List<Int>) {
        val selectedFilters = checkedIds.mapNotNull {
            when (it) {
                binding.toxicChip.id -> PlantToxicity.Toxic
                binding.mildlyToxicChip.id -> PlantToxicity.MildlyToxic
                binding.nonToxicChip.id -> PlantToxicity.NonToxic
                else -> null
            }
        }
        viewModel.changeFiltering(selectedFilters)
    }

    private fun onPlantClicked(plantId: Long) {
        Toast.makeText(
            requireContext(), "TODO: Not yet implemented, ID: $plantId", Toast.LENGTH_SHORT
        ).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding.plantList.adapter = null
        binding.filtersGroup.setOnCheckedStateChangeListener(null)
        _binding = null
    }

}