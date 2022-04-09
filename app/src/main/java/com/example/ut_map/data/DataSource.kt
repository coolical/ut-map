package com.example.ut_map.data

import com.example.ut_map.R
import com.example.ut_map.model.Category
import com.example.ut_map.model.Location

object DataSource {
    val locations: List<Location> = listOf(
        Location(
            "PETER O'DONNELL JR. BUILDING",
            30.28718,
            -97.73655,
            listOf("academic")
        ),
        Location(
            "Blanton Museum of Art",
            30.28541,
            -97.73768,
            listOf("museum")
        ),
        Location(
            "Frank Erwin Center",
            30.27658,
            -97.73182,
            listOf("events")
        ),
        Location(
            "Gregory Gym",
            30.28361,
            -97.73650,
            listOf("exercise")
        ),
        Location(
            "Jester Dormitory",
            30.28265,
            -97.73675,
            listOf("dorm")
        ),
        Location(
            "LBJ Library",
            30.28575,
            -97.72920,
            listOf("museum")
        ),
        Location(
            "McCombs School of Business",
            30.28398,
            -97.73792,
            listOf("academic")
        ),
        Location(
            "PCL",
            30.28240,
            -97.73788,
            listOf("library")
        ),
        Location(
            "Performing Arts Center",
            30.28604,
            -97.73135,
            listOf("academic", "events")
        ),
        Location(
            "Ransom Center",
            30.28892,
            -97.74124,
            listOf("museum")
        ),
        Location(
            "PMA",
            30.28892,
            -97.73634,
            listOf("academic")
        ),
        Location(
            "School of Communications",
            30.28929,
            -97.74066,
            listOf("academic")
        ),
        Location(
            "School of Education",
            30.28140,
            -97.73875,
            listOf("academic")
        ),
        Location(
            "School of Social Work",
            30.28037,
            -97.73252,
            listOf("academic")
        ),
        Location(
            "South Mall",
            30.28442,
            -97.73949,
            listOf("recreation")
        ),
        Location(
            "Student Services Building",
            30.29017,
            -97.73996,
            listOf("service")
        ),
        Location(
            "Texas Memorial Stadium",
            30.28361,
            -97.73252,
            listOf("events", "academic")
        ),
        Location(
            "Texas State History Museum",
            30.28015,
            -97.73891,
            listOf("museum")
        ),
        Location(
            "Texas Union",
            30.28663,
            -97.74116,
            listOf("recreation")
        ),
        Location(
            "University Teaching Center",
            30.28619,
            -97.74033,
            listOf("academic")
        ),
        Location(
            "UT Tower",
            30.28565,
            -97.73921,
            listOf("landmark", "academic")
        ),
        Location(
            "UTPD",
            30.28398,
            -97.73036,
            listOf("police")
        ),
        Location(
            "Welch Hall",
            30.28656,
            -97.73783,
            listOf("academic")
        )

    )
    val categories: List<Category> = listOf(
        Category(
            R.drawable.ic_baseline_school_24,
            "Academic",
            listOf(
                Location(
                    "Welch Hall",
                    30.28656,
                    -97.73783,
                    listOf("academic")
                ),
                Location(
                    "UT Tower",
                    30.28565,
                    -97.73921,
                    listOf("landmark", "academic")
                ),
                Location(
                    "University Teaching Center",
                    30.28619,
                    -97.74033,
                    listOf("academic")
                ),
                Location(
                    "Texas Memorial Stadium",
                    30.28361,
                    -97.73252,
                    listOf("events", "academic")
                ),
                Location(
                    "School of Social Work",
                    30.28037,
                    -97.73252,
                    listOf("academic")
                ),
                Location(
                    "School of Education",
                    30.28140,
                    -97.73875,
                    listOf("academic")
                ),
                Location(
                    "PMA",
                    30.28892,
                    -97.73634,
                    listOf("academic")
                ),
                Location(
                    "School of Communications",
                    30.28929,
                    -97.74066,
                    listOf("academic")
                ),
                Location(
                    "Performing Arts Center",
                    30.28604,
                    -97.73135,
                    listOf("academic", "events")
                ),
                Location(
                    "McCombs School of Business",
                    30.28398,
                    -97.73792,
                    listOf("academic")
                ),
                Location(
                    "PETER O'DONNELL JR. BUILDING",
                    30.28718,
                    -97.73655,
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
                    30.28015,
                    -97.73891,
                    listOf("museum")
                ),
                Location(
                    "Ransom Center",
                    30.28892,
                    -97.74124,
                    listOf("museum")
                ),
                Location(
                    "LBJ Library",
                    30.28575,
                    -97.72920,
                    listOf("museum")
                ),
                Location(
                    "Blanton Museum of Art",
                    30.28541,
                    -97.73768,
                    listOf("museum")
                )
            )
        )
    )
}