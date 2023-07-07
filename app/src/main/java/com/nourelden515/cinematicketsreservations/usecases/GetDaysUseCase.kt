package com.nourelden515.cinematicketsreservations.usecases

import com.nourelden515.cinematicketsreservations.ui.screen.booking.DayUiState
import javax.inject.Inject

class GetDaysUseCase @Inject constructor() {
    operator fun invoke(): List<DayUiState> {
        val days = (1..31).toList()
        val daysOfWeek = listOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat")
        val times = listOf("10:00", "12:30", "12:30", "15:30", "18:30", "21:30", "23:30")

        return days.map {
            DayUiState(
                dayNumber = it,
                dayText = daysOfWeek[(it - 1) % 7],
                times = times
            )
        }
    }
}