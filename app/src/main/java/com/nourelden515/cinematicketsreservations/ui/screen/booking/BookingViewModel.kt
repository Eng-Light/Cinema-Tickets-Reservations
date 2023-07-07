package com.nourelden515.cinematicketsreservations.ui.screen.booking

import androidx.lifecycle.ViewModel
import com.nourelden515.cinematicketsreservations.usecases.GetDaysUseCase
import com.nourelden515.cinematicketsreservations.usecases.GetSeatsDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor(
    private val getSeatsDataUseCase: GetSeatsDataUseCase,
    private val getDaysUseCase: GetDaysUseCase,
) : ViewModel() {
    private val _state = MutableStateFlow(BookingUiState())
    val state = _state.asStateFlow()

    init {
        getSeats()
        getDays()
    }

    private fun getSeats() {
        _state.update { it.copy(rows = getSeatsDataUseCase()) }
    }

    private fun getDays() {
        _state.update { it.copy(days = getDaysUseCase()) }
    }
}