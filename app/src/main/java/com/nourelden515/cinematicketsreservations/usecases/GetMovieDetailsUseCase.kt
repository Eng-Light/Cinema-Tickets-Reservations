package com.nourelden515.cinematicketsreservations.usecases

import com.nourelden515.cinematicketsreservations.entity.MovieDetails
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor() {
    operator fun invoke(id: Int): MovieDetails? {
        val movies = listOf(
            MovieDetails(
                id = 1,
                imageUrl = "https://m.media-amazon.com/images/M/MV5BMjMxOTM1OTI4MV5BMl5BanBnXkFtZTgwODE5OTYxMDI@._V1_FMjpg_UX1000_.jpg",
                imageContentDescription = "",
                name = "Fantastic Beasts and Where to Find Them",
                categories = listOf("Fantasy", "Adventure", "Family"),
                time = "2h 12m",
                cast = listOf(
                    "https://nationaltoday.com/wp-content/uploads/2022/05/107-Johnny-Depp-1200x834.jpg.webp",
                    "https://resize-elle.ladmedia.fr/rcrop/638,,forcex/img/var/plain_site/storage/images/people/la-vie-des-people/news/jude-law-son-evolution-annee-apres-annee-cheveux-apres-cheveux/2012/75357962-1-fre-FR/2012.jpg",
                    "https://variety.com/wp-content/uploads/2023/06/ezra-miller-flash-premiere.jpg?w=1000&h=563&crop=1",
                    "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSPOwE_B4zRp1v9tl1d7skJqbXXSjWSWevvlopkyl6gkqkIqa3wxK2yC0WJfCf9gz1MvDRi__JKb14n6hs",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSoj6T60R0ou6frztzAZMZWQMZjd3Bz8B1FQLh0uDj3RS_-YOk0_VE--VNecjw-QMh_OIzSm773reqnuDM",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSJpX8ztZnkD_8N1ZTApoJs6MyWaHsLlF73qZzEqcYX7DLtgeXzNR0rOTGU1YA2tmbOC7jxHWWtWuBvmMY"
                ),
                description = "The adventures of writer Newt Scamander in New York's secret community of witches and wizards seventy years before Harry Potter reads his book in school.",
                imdbRate = "7.2",
                rottenTomatoesRate = "74%",
                ignRate = "6.5"
            ),
            MovieDetails(
                id = 2,
                imageUrl = "https://m.media-amazon.com/images/M/MV5BYWVlMDI5N2UtZTIyMC00NjZkLWI5Y2QtODM5NGE5MzA0NmVjXkEyXkFqcGdeQXVyNzU3NjUxMzE@._V1_FMjpg_UX1000_.jpg",
                imageContentDescription = "",
                name = "Fantastic Beasts: The Crimes of Grindelwald",
                categories = listOf("Fantasy", "Adventure"),
                time = "2h 14m",
                cast = listOf(
                    "https://nationaltoday.com/wp-content/uploads/2022/05/107-Johnny-Depp-1200x834.jpg.webp",
                    "https://resize-elle.ladmedia.fr/rcrop/638,,forcex/img/var/plain_site/storage/images/people/la-vie-des-people/news/jude-law-son-evolution-annee-apres-annee-cheveux-apres-cheveux/2012/75357962-1-fre-FR/2012.jpg",
                    "https://variety.com/wp-content/uploads/2023/06/ezra-miller-flash-premiere.jpg?w=1000&h=563&crop=1",
                    "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSPOwE_B4zRp1v9tl1d7skJqbXXSjWSWevvlopkyl6gkqkIqa3wxK2yC0WJfCf9gz1MvDRi__JKb14n6hs",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSoj6T60R0ou6frztzAZMZWQMZjd3Bz8B1FQLh0uDj3RS_-YOk0_VE--VNecjw-QMh_OIzSm773reqnuDM",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSJpX8ztZnkD_8N1ZTApoJs6MyWaHsLlF73qZzEqcYX7DLtgeXzNR0rOTGU1YA2tmbOC7jxHWWtWuBvmMY"
                ),
                description = "",
                imdbRate = "6.5",
                rottenTomatoesRate = "36%",
                ignRate = "8"
            ),
            MovieDetails(
                id = 3,
                imageUrl = "https://www.chicklit.nl/ckfinder/userfiles/images/Chicklit/artikelen/Films/Fantastic%20Beasts-%20The%20Secrets%20of%20Dumbledore%20-%20Dumbledore.jpeg",
                imageContentDescription = "",
                name = "Fantastic Beasts: The Secrets of Dumbledore",
                categories = listOf("Fantasy", "Adventure"),
                time = "2h 23m",
                cast = listOf(
                    "https://nationaltoday.com/wp-content/uploads/2022/05/107-Johnny-Depp-1200x834.jpg.webp",
                    "https://resize-elle.ladmedia.fr/rcrop/638,,forcex/img/var/plain_site/storage/images/people/la-vie-des-people/news/jude-law-son-evolution-annee-apres-annee-cheveux-apres-cheveux/2012/75357962-1-fre-FR/2012.jpg",
                    "https://variety.com/wp-content/uploads/2023/06/ezra-miller-flash-premiere.jpg?w=1000&h=563&crop=1",
                    "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSPOwE_B4zRp1v9tl1d7skJqbXXSjWSWevvlopkyl6gkqkIqa3wxK2yC0WJfCf9gz1MvDRi__JKb14n6hs",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSoj6T60R0ou6frztzAZMZWQMZjd3Bz8B1FQLh0uDj3RS_-YOk0_VE--VNecjw-QMh_OIzSm773reqnuDM",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSJpX8ztZnkD_8N1ZTApoJs6MyWaHsLlF73qZzEqcYX7DLtgeXzNR0rOTGU1YA2tmbOC7jxHWWtWuBvmMY"
                ),
                description = "Professor Albus Dumbledore must assist Newt Scamander and his partners as Grindelwald begins to lead an army to eliminate all Muggles.",
                imdbRate = "6.2",
                rottenTomatoesRate = "46%",
                ignRate = "4"
            ), MovieDetails(
                id = 4,
                imageUrl = "https://www.chicklit.nl/ckfinder/userfiles/images/Chicklit/artikelen/Films/Fantastic%20Beasts-%20The%20Secrets%20of%20Dumbledore%20-%20Dumbledore.jpeg",
                imageContentDescription = "",
                name = "Fantastic Beasts: The Secrets of Dumbledore",
                categories = listOf("Fantasy", "Adventure"),
                time = "2h 23m",
                cast = listOf(
                    "https://nationaltoday.com/wp-content/uploads/2022/05/107-Johnny-Depp-1200x834.jpg.webp",
                    "https://resize-elle.ladmedia.fr/rcrop/638,,forcex/img/var/plain_site/storage/images/people/la-vie-des-people/news/jude-law-son-evolution-annee-apres-annee-cheveux-apres-cheveux/2012/75357962-1-fre-FR/2012.jpg",
                    "https://variety.com/wp-content/uploads/2023/06/ezra-miller-flash-premiere.jpg?w=1000&h=563&crop=1",
                    "https://encrypted-tbn0.gstatic.com/licensed-image?q=tbn:ANd9GcSPOwE_B4zRp1v9tl1d7skJqbXXSjWSWevvlopkyl6gkqkIqa3wxK2yC0WJfCf9gz1MvDRi__JKb14n6hs",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSoj6T60R0ou6frztzAZMZWQMZjd3Bz8B1FQLh0uDj3RS_-YOk0_VE--VNecjw-QMh_OIzSm773reqnuDM",
                    "https://encrypted-tbn2.gstatic.com/licensed-image?q=tbn:ANd9GcSJpX8ztZnkD_8N1ZTApoJs6MyWaHsLlF73qZzEqcYX7DLtgeXzNR0rOTGU1YA2tmbOC7jxHWWtWuBvmMY"
                ),
                description = "Professor Albus Dumbledore must assist Newt Scamander and his partners as Grindelwald begins to lead an army to eliminate all Muggles.",
                imdbRate = "6.2",
                rottenTomatoesRate = "46%",
                ignRate = "4"
            )
        )
        return movies.find { id == it.id }
    }
}