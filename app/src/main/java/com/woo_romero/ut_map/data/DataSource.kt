package com.woo_romero.ut_map.data

import com.google.android.gms.maps.model.LatLng
import com.woo_romero.ut_map.R
import com.woo_romero.ut_map.model.Category
import com.woo_romero.ut_map.model.Location

object DataSource {
    var position: LatLng = LatLng(30.28337591974864, -97.7388566451791)
    val locations: List<Location> = listOf(
        Location(
            "PETER O'DONNELL JR. BUILDING",
            30.287005212888587,
            -97.73660177401467,
            listOf("academic"),
            "https://research.utexas.edu/"
        ),
        Location(
            "Blanton Museum of Art",
            30.28091279720475,
            -97.73768380197225,
            listOf("museum"),
            "https://blantonmuseum.org/"
        ),
        Location(
            "Frank Erwin Center",
            30.277000739632616,
            -97.73224937498895,
            listOf("events"),
            "http://uterwincenter.com/"
        ),
        Location(
            "Gregory Gym",
            30.284471876537506,
            -97.73684403168721,
            listOf("exercise"),
            "utrecsports.org/facilities/facility/gregory-gym"
        ),
        Location(
            "Jester West Dormitory",
            30.28263501982062,
            -97.73636570197228,
            listOf("dorm"),
            "https://housing.utexas.edu/housing/residence-halls/residence-hall-locations/jester-west-hall"
        ),
        Location(
            "LBJ Library",
            30.2860226438296,
            -97.72914711361118,
            listOf("museum"),
            "https://www.lbjlibrary.org/"
        ),
        Location(
            "McCombs School of Business",
            30.284294517312823,
            -97.73760828662783,
            listOf("academic"),
            "https://www.mccombs.utexas.edu/"
        ),
        Location(
            "Perry-Castañeda Library",
            30.28282424926724, -97.73824008848051,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/pcl"
        ),
        Location(
            "Performing Arts Center",
            30.286269462496037, -97.73128496052304,
            listOf("events"),
            "https://www.performingartscenter.org/"
        ),
        Location(
            "Ransom Center",
            30.28420267578833,
            -97.74126391731657,
            listOf("museum"),
            "https://www.hrc.utexas.edu/"
        ),
        Location(
            "PMA",
            30.289788834241275, -97.73628576706923,
            listOf("academic"),
            "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/PMA/"
        ),
        Location(
            "School of Communications",
            30.291084126200122, -97.74075373593445,
            listOf("academic"),
            "https://moody.utexas.edu/"

        ),
        Location(
            "School of Social Work",
            30.280815299306163, -97.73248555867119,
            listOf("academic"),
            "https://socialwork.utexas.edu/"
        ),
        Location(
            "South Mall",
            30.284829645857947, -97.73973770197217,
            listOf("recreation")

        ),
        Location(
            "Student Services Building",
            30.289889829656435, -97.73844470099756,
            listOf("service"),
            "http://utw10765.utweb.utexas.edu/"
        ),
        Location(
            "Texas Memorial Stadium",
            30.283706847766823, -97.73246575779174,
            listOf("events", "academic"),
            "https://www.texasmemorialstadium.com/information/"
        ),
        Location(
            "Texas State History Museum",
            30.28045742784852, -97.73901505779175,
            listOf("museum"),
            "https://www.thestoryoftexas.com/visit"
        ),
        Location(
            "Texas Union",
            30.286818277987184, -97.74113131546382,
            listOf("recreation"),
            "https://universityunions.utexas.edu/texas-union"
        ),
        Location(
            "University Teaching Center",
            30.28333886054443, -97.7388566451791,
            listOf("academic"),
            "https://ctl.utexas.edu/"
        ),
        Location(
            "UT Tower",
            30.28337591974864, -97.7388566451791,
            listOf("landmark", "academic"),
            "https://tower.utexas.edu/"
        ),
        Location(
            "UTPD",
            30.284160329095975, -97.73015038106973,
            listOf("police"),
            "https://police.utexas.edu/"
        ),
        Location(
            "Welch Hall",
            30.286791713538825, -97.73777611546386,
            listOf("academic"),
            "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/WEL/"
        ),
        Location(
            "J2 Dinning Hall",
            30.28301122043788, -97.7369593893597,
            listOf("Dinning Hall"),
            "https://housing.utexas.edu/dining/dining-locations/dining-halls/j2-dining"
        ),
        Location(
            "Kinsolving Dinning Hall",
            30.29047938528276, -97.7396850596443,
            listOf("Dinning Hall"),
            "https://housing.utexas.edu/dining/dining-locations/dining-halls/kins-dining"
        ),
        Location(
            "Architecture & Planning Library",
            30.28543186860742, -97.74044567911712,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/architecture-planning"
        ),
        Location(
            "Life Science Library",
            30.28630048514125, -97.73939807401473,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/life-science"
        ),
        Location(
            "Mallet Chemistry Library",
            30.286865829324743, -97.73780830197215,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/chemistry"
        ),
        Location(
            "Classics Library",
            30.285223597693644, -97.73773571916931,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/classics"
        ),
        Location(
            "Walter Geology Library",
            30.28611486646582, -97.73570407313608,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/geology"
        ),
        Location(
            "Collections Deposit Library",
            30.27909200353985, -97.7330234596445,
            listOf("library"),
        "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/CDL/"
        ),
        Location(
            "Benson Latin American Studies and Collections",
            30.284002335815607, -97.72927804430005,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/benson"
        ),
        Location(
            "Fine Arts Library",
            30.28630508620641, -97.73169535779166,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/fine-arts"
        ),
        Location(
            "McKinney Engineering Library",
            30.288160511469933, -97.73556882658004,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/engineering"
        ),
        Location(
            "Kuehne Physics Mathematics Astronomy Library",
            30.28914422438757, -97.73651617498872,
            listOf("library"),
            "https://www.lib.utexas.edu/about/locations/physics-math-astronomy"
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
                    listOf("academic"),
                    "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/WEL/"
                ),
                Location(
                    "UT Tower",
                    30.28337591974864, -97.7388566451791,
                    listOf("landmark", "academic"),
                    "https://tower.utexas.edu/"
                ),
                Location(
                    "University Teaching Center",
                    30.28333886054443, -97.7388566451791,
                    listOf("academic"),
                    "https://ctl.utexas.edu/"
                ),
                Location(
                    "Texas Memorial Stadium",
                    30.283706847766823, -97.73246575779174,
                    listOf("events", "academic"),
                    "https://www.texasmemorialstadium.com/information/"
                ),
                Location(
                    "School of Social Work",
                    30.280815299306163, -97.73248555867119,
                    listOf("academic"),
                    "https://socialwork.utexas.edu/"
                ),
                Location(
                    "PMA",
                    30.289788834241275, -97.73628576706923,
                    listOf("academic"),
                    "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/PMA/"
                ),
                Location(
                    "School of Communications",
                    30.291084126200122, -97.74075373593445,
                    listOf("academic"),
                    "https://moody.utexas.edu/"

                ),
                Location(
                    "McCombs School of Business",
                    30.284294517312823,
                    -97.73760828662783,
                    listOf("academic"),
                    "https://www.mccombs.utexas.edu/"
                ),
                Location(
                    "PETER O'DONNELL JR. BUILDING",
                    30.287005212888587,
                    -97.73660177401467,
                    listOf("academic"),
                    "https://research.utexas.edu/"
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
                    listOf("museum"),
                    "https://www.thestoryoftexas.com/visit"
                ),
                Location(
                    "Ransom Center",
                    30.28420267578833,
                    -97.74126391731657,
                    listOf("museum"),
                    "https://www.hrc.utexas.edu/"
                ),
                Location(
                    "LBJ Library",
                    30.2860226438296,
                    -97.72914711361118,
                    listOf("museum"),
                    "https://www.lbjlibrary.org/"
                ),
                Location(
                    "Blanton Museum of Art",
                    30.28091279720475,
                    -97.73768380197225,
                    listOf("museum"),
                    "https://blantonmuseum.org/"
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
                    listOf("Dinning Hall"),
                    "https://housing.utexas.edu/dining/dining-locations/dining-halls/j2-dining"
                ),
                Location(
                    "Kinsolving Dinning Hall",
                    30.29047938528276, -97.7396850596443,
                    listOf("Dinning Hall"),
                    "https://housing.utexas.edu/dining/dining-locations/dining-halls/kins-dining"
                )
            )
        ),
        Category(
            R.drawable.ic_baseline_local_library_24,
            "Libraries",
            listOf(
                Location(
                    "Perry-Castañeda Library",
                    30.28282424926724, -97.73824008848051,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/pcl"
                ),
                Location(
                    "Architecture & Planning Library",
                    30.28543186860742, -97.74044567911712,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/architecture-planning"
                ),
                Location(
                    "Life Science Library",
                    30.28630048514125, -97.73939807401473,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/life-science"
                ),
                Location(
                    "Mallet Chemistry Library",
                    30.286865829324743, -97.73780830197215,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/chemistry"
                ),
                Location(
                    "Classics Library",
                    30.285223597693644, -97.73773571916931,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/classics"
                ),
                Location(
                    "Walter Geology Library",
                    30.28611486646582, -97.73570407313608,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/geology"
                ),
                Location(
                    "Collections Deposit Library",
                    30.27909200353985, -97.7330234596445,
                    listOf("library"),
                    "https://utdirect.utexas.edu/apps/campus/buildings/nlogon/maps/UTM/CDL/"
                ),
                Location(
                    "Benson Latin American Studies and Collections",
                    30.284002335815607, -97.72927804430005,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/benson"
                ),
                Location(
                    "Fine Arts Library",
                    30.28630508620641, -97.73169535779166,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/fine-arts"
                ),
                Location(
                    "McKinney Engineering Library",
                    30.288160511469933, -97.73556882658004,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/engineering"
                ),
                Location(
                    "Kuehne Physics Mathematics Astronomy Library",
                    30.28914422438757, -97.73651617498872,
                    listOf("library"),
                    "https://www.lib.utexas.edu/about/locations/physics-math-astronomy"
                )
            )
        )
    )
}