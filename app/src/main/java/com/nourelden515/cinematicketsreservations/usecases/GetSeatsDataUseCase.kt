package com.nourelden515.cinematicketsreservations.usecases

import com.nourelden515.cinematicketsreservations.ui.screen.booking.ContainerState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatUiState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatsContainerUiState
import com.nourelden515.cinematicketsreservations.ui.screen.booking.SeatsRowUiState
import javax.inject.Inject

class GetSeatsDataUseCase @Inject constructor() {
    operator fun invoke(): List<SeatsRowUiState> {
        return listOf(
            SeatsRowUiState(
                id = 1,
                seatContainers = listOf(
                    SeatsContainerUiState(
                        id = 1,
                        rowId = 1,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 1,
                                containerId = 1,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 1,
                                containerId = 1,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 2,
                        rowId = 1,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 1,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 1,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 3,
                        rowId = 1,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 1,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 1,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                )
            ),
            SeatsRowUiState(
                id = 2,
                seatContainers = listOf(
                    SeatsContainerUiState(
                        id = 1,
                        rowId = 2,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 2,
                                containerId = 1,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 2,
                                containerId = 1,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 2,
                        rowId = 2,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 2,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 2,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 3,
                        rowId = 2,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 2,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 2,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                )
            ),
            SeatsRowUiState(
                id = 3,
                seatContainers = listOf(
                    SeatsContainerUiState(
                        id = 1,
                        rowId = 3,
                        state = ContainerState.SELECTED,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 3,
                                containerId = 1,
                                state = SeatState.SELECTED,
                            ), SeatUiState(
                                id = 2,
                                rowId = 3,
                                containerId = 1,
                                state = SeatState.SELECTED,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 2,
                        rowId = 3,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 3,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 3,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 3,
                        rowId = 3,
                        state = ContainerState.HALF_SELECTED,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 3,
                                containerId = 3,
                                state = SeatState.SELECTED,
                            ), SeatUiState(
                                id = 2,
                                rowId = 3,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                )
            ),
            SeatsRowUiState(
                id = 4,
                seatContainers = listOf(
                    SeatsContainerUiState(
                        id = 1,
                        rowId = 4,
                        state = ContainerState.HALF_TAKEN,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 4,
                                containerId = 1,
                                state = SeatState.TAKEN,
                            ), SeatUiState(
                                id = 2,
                                rowId = 4,
                                containerId = 1,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 2,
                        rowId = 4,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 4,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 4,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 3,
                        rowId = 4,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 4,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 4,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                )
            ),
            SeatsRowUiState(
                id = 5,
                seatContainers = listOf(
                    SeatsContainerUiState(
                        id = 1,
                        rowId = 5,
                        state = ContainerState.TAKEN,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 5,
                                containerId = 1,
                                state = SeatState.TAKEN,
                            ), SeatUiState(
                                id = 2,
                                rowId = 5,
                                containerId = 1,
                                state = SeatState.TAKEN,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 2,
                        rowId = 5,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 5,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 5,
                                containerId = 2,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                    SeatsContainerUiState(
                        id = 3,
                        rowId = 5,
                        state = ContainerState.AVAILABLE,
                        seats = Pair(
                            SeatUiState(
                                id = 1,
                                rowId = 5,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            ), SeatUiState(
                                id = 2,
                                rowId = 5,
                                containerId = 3,
                                state = SeatState.AVAILABLE,
                            )
                        )
                    ),
                )
            ),
        )
    }
}