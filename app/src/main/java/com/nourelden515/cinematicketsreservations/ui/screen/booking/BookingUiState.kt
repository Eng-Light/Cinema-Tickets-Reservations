package com.nourelden515.cinematicketsreservations.ui.screen.booking

data class BookingUiState(
    val numberOfTickets: Int = 4,
    val totalPrice: Float = 100.00f,
    val days: List<DayUiState> = emptyList(),
    val rows: List<SeatsRowUiState> = emptyList(),
)

data class DayUiState(
    val dayNumber: Int,
    val dayText: String,
    val times: List<String>,
)

data class SeatsRowUiState(
    val id: Int,
    val seatContainers: List<SeatsContainerUiState>,
)

data class SeatsContainerUiState(
    val id: Int,
    val rowId: Int,
    val state: ContainerState,
    val seats: Pair<SeatUiState, SeatUiState>,
)

data class SeatUiState(
    val id: Int = 0,
    val containerId: Int,
    val rowId: Int,
    val state: SeatState,
)

enum class ContainerState {
    TAKEN, HALF_TAKEN, AVAILABLE, SELECTED, HALF_SELECTED
}

enum class SeatState {
    AVAILABLE, TAKEN, SELECTED
}