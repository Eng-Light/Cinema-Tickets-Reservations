package com.nourelden515.cinematicketsreservations.ui.screen.home

import androidx.lifecycle.ViewModel
import com.nourelden515.cinematicketsreservations.usecases.GetMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(val getMovies: GetMoviesUseCase) : ViewModel() {
    private val _state = MutableStateFlow(HomeUIState())
    val state = _state.asStateFlow()

    init {
        getData()
    }

    private fun getData() {
        _state.update { it.copy(movies = getMovies().toMovieUiState()) }
    }
}