package com.nourelden515.cinematicketsreservations.usecases

import com.nourelden515.cinematicketsreservations.entity.Movie
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor() {
    operator fun invoke(): List<Movie> {
        return listOf(
            Movie(
                1,
                "https://m.media-amazon.com/images/M/MV5BMjMxOTM1OTI4MV5BMl5BanBnXkFtZTgwODE5OTYxMDI@._V1_FMjpg_UX1000_.jpg",
                imageContentDescription = "",
                "Fantastic Beasts and Where to Find Them",
                listOf("Fantasy", "Adventure","Family"),
                "2h 12m"
            ),
            Movie(
                2,
                "https://m.media-amazon.com/images/M/MV5BYWVlMDI5N2UtZTIyMC00NjZkLWI5Y2QtODM5NGE5MzA0NmVjXkEyXkFqcGdeQXVyNzU3NjUxMzE@._V1_FMjpg_UX1000_.jpg",
                imageContentDescription = "",
                "Fantastic Beasts: The Crimes of Grindelwald",
                listOf("Fantasy", "Adventure"),
                "2h 14m"
            ),
            Movie(
                3,
                "https://www.chicklit.nl/ckfinder/userfiles/images/Chicklit/artikelen/Films/Fantastic%20Beasts-%20The%20Secrets%20of%20Dumbledore%20-%20Dumbledore.jpeg",
                imageContentDescription = "",
                "Fantastic Beasts: The Secrets of Dumbledore",
                listOf("Fantasy", "Adventure"),
                "2h 23m"
            ),
            Movie(
                4,
                "https://www.chicklit.nl/ckfinder/userfiles/images/Chicklit/artikelen/Films/Fantastic%20Beasts-%20The%20Secrets%20of%20Dumbledore%20-%20Dumbledore.jpeg",
                imageContentDescription = "",
                "Fantastic Beasts: The Secrets of Dumbledore",
                listOf("Fantasy", "Adventure"),
                "2h 23m"
            )
        )
    }
}