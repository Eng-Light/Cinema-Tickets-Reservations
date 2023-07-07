package com.nourelden515.cinematicketsreservations.ui.screen.moviedetails

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.nourelden515.cinematicketsreservations.usecases.GetMovieDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel @Inject constructor(
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    savedStateHandle: SavedStateHandle,
) : ViewModel() {

    private val args = MovieDetailsArgs(savedStateHandle)

    private val _state = MutableStateFlow(MovieDetailsUiState())
    val state = _state.asStateFlow()

    init {
        getMovieById(args.movieId.toInt())
    }

    private fun getMovieById(id: Int) {
        _state.update { getMovieDetailsUseCase(id)!!.toMovieDetailsUiState() }
    }
}