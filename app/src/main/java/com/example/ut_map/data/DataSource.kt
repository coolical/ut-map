package com.example.ut_map.data

import com.example.ut_map.R
import com.example.ut_map.model.Category
import com.example.ut_map.model.Location

object DataSource {
    val locations: List<Location> = listOf(
        Location(
            "PETER O'DONNELL JR. BUILDING",
            30.287005212888587,
            -97.73660177401467,
            listOf("academic")
        ),
        Location(
            "Blanton Museum of Art",
            30.28091279720475,
            -97.73768380197225,
            listOf("museum")
        ),
        Location(
            "Frank Erwin Center",
            30.277000739632616,
            -97.73224937498895,
            listOf("events")
        ),
        Location(
            "Gregory Gym",
            30.284471876537506,
            -97.73684403168721,
            listOf("exercise")
        ),
        Location(
            "Jester West Dormitory",
            30.28263501982062,
            -97.73636570197228,
            listOf("dorm")
        ),
        Location(
            "LBJ Library",
            30.2860226438296,
            -97.72914711361118,
            listOf("museum")
        ),
        Location(
            "McCombs School of Business",
            30.284294517312823,
            -97.73760828662783,
            listOf("academic")
        ),
        Location(
            "PCL",
            30.28282424926724, -97.73824008848051,
            listOf("library")
        ),
        Location(
            "Performing Arts Center",
            30.286269462496037, -97.73128496052304,
            listOf("events")
        ),
        Location(
            "Ransom Center",
            30.28420267578833,
            -97.74126391731657,
            listOf("museum")
        ),
        Location(
            "PMA",
            30.289788834241275, -97.73628576706923,
            listOf("academic")
        ),
        Location(
            "School of Communications",
            30.291084126200122, -97.74075373593445,
            listOf("academic")
        ),
        Location(
            "School of Social Work",
            30.280815299306163, -97.73248555867119,
            listOf("academic")
        ),
        Location(
            "South Mall",
            30.284829645857947, -97.73973770197217,
            listOf("recreation")
        ),
        Location(
            "Student Services Building",
            30.289889829656435, -97.73844470099756,
            listOf("service")
        ),
        Location(
            "Texas Memorial Stadium",
            30.283706847766823, -97.73246575779174,
            listOf("events", "academic")
        ),
        Location(
            "Texas State History Museum",
            30.28045742784852, -97.73901505779175,
            listOf("museum")
        ),
        Location(
            "Texas Union",
            30.286818277987184, -97.74113131546382,
            listOf("recreation")
        ),
        Location(
            "University Teaching Center",
            30.28333886054443, -97.7388566451791,
            listOf("academic")
        ),
        Location(
            "UT Tower",
            30.28337591974864, -97.7388566451791,
            listOf("landmark", "academic")
        ),
        Location(
            "UTPD",
            30.284160329095975, -97.73015038106973,
            listOf("police")
        ),
        Location(
            "Welch Hall",
            30.286791713538825, -97.73777611546386,
            listOf("academic")
        ),
        Location(
            "J2 Dinning Hall",
            30.28301122043788, -97.7369593893597,
            listOf("Dinning Hall")
        ),
        Location(
            "Kinsolving Dinning Hall",
            30.29047938528276, -97.7396850596443,
            listOf("Dinning Hall")
        )

    )
    val categories: List<Category> = listOf(
        Category(
            R.drawable.ic_baseline_school_24,
            "Academic",
            listOf(
                Location(
                    "Welch Hall",
                    30.286791713538825, -97.73777611546386,
                    listOf("academic")
                ),
                Location(
                    "UT Tower",
                    30.286310127065054,
                    -97.73939873080825,
                    listOf("landmark", "academic")
                ),
                Location(
                    "University Teaching Center",
                    30.28333886054443, -97.7388566451791,
                    listOf("academic")
                ),
                Location(
                    "Texas Memorial Stadium",
                    30.283706847766823, -97.73246575779174,
                    listOf("events", "academic")
                ),
                Location(
                    "School of Social Work",
                    30.280815299306163, -97.73248555867119,
                    listOf("academic")
                ),
                Location(
                    "PMA",
                    30.289788834241275, -97.73628576706923,
                    listOf("academic")
                ),
                Location(
                    "School of Communications",
                    30.291084126200122, -97.74075373593445,
                    listOf("academic")
                ),
                Location(
                    "McCombs School of Business",
                    30.284294517312823,
                    -97.73760828662783,
                    listOf("academic")
                ),
                Location(
                    "PETER O'DONNELL JR. BUILDING",
                    30.287005212888587,
                    -97.73660177401467,
                    listOf("academic")
                )

            )
        ),
        Category(
            R.drawable.ic_baseline_museum_24,
            "Museum",
            listOf(
                Location(
                    "Texas State History Museum",
                    30.28045742784852, -97.73901505779175,
                    listOf("museum")
                ),
                Location(
                    "Ransom Center",
                    30.28420267578833,
                    -97.74126391731657,
                    listOf("museum")
                ),
                Location(
                    "LBJ Library",
                    30.2860226438296,
                    -97.72914711361118,
                    listOf("museum")
                ),
                Location(
                    "Blanton Museum of Art",
                    30.28091279720475,
                    -97.73768380197225,
                    listOf("museum")
                )
            )
        ),
        Category(
            R.drawable.ic_baseline_local_dining_24,
            "Dinning Hall",
            listOf(
                Location(
                    "J2 Dinning Hall",
                    30.28301122043788, -97.7369593893597,
                    listOf("Dinning Hall")
                ),
                Location(
                    "Kinsolving Dinning Hall",
                    30.29047938528276, -97.7396850596443,
                    listOf("Dinning Hall")
                )
            )
        )

    )
}