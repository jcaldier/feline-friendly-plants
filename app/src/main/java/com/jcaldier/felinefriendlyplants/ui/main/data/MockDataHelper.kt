package com.jcaldier.felinefriendlyplants.ui.main.data

object MockDataHelper {

    val aloe = Plant(
        plantId = 0,
        commonName = "Aloe",
        aliases = listOf(
            "Aloe barbadensis",
            "Aloe barbadensis chinensis",
            "Aloe chinensis",
            "Aloe elongata",
            "Aloe flava",
            "Aloe indica",
            "Aloe lanzae",
            "Aloe maculata",
            "Aloe perfoliata",
            "Aloe rubescens",
            "Aloe variegata",
            "Aloe vera littoralis",
            "Aloe vulgaris"
        ),
        scientificName = "Aloe vera",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/b/b5/Aloe_Vera.jpg",
        description = "Aloe vera is a stemless or very short-stemmed plant growing to 60–100 " +
                "centimetres tall, spreading by offsets. The leaves are thick" +
                " and fleshy, green to grey-green, with some varieties showing white flecks" +
                " on their upper and lower stem surfaces. The margin of the leaf is serrated " +
                "and has small white teeth. The flowers are produced in summer on a spike" +
                " up to 90 cm tall, each flower being pendulous, with a yellow tubular" +
                " corolla 2–3 cm long. Like other Aloe species, Aloe vera forms arbuscular" +
                " mycorrhiza, a symbiosis that allows the plant better access to mineral" +
                " nutrients in soil.",
        toxicStatus = PlantToxicity.Toxic
    )

    val spiderPlant = Plant(
        plantId = 1,
        commonName = "Spider Plant",
        aliases = listOf(
            "Anthericum comosum",
            "Hartwegia comosa",
            "Ribbon Plant",
            "Spider Ivy"
        ),
        scientificName = "Chlorophytum comosum",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/b/b1/Hierbabuena_0611_Revised.jpg",
        description = "A species of evergreen perennial flowering plant of the family" +
                " Asparagaceae. It is native to tropical and southern Africa, but has become" +
                " naturalized in other parts of the world, including western Australia and " +
                "the Bangladesh. Chlorophytum comosum is easy to grow as a houseplant because" +
                " of its resilience, but it can be sensitive to the fluoride in tap water, " +
                "which commonly gives it burnt tips. Variegated forms are the most popular.",
        toxicStatus = PlantToxicity.MildlyToxic
    )

    val waxPlant = Plant(
        plantId = 2,
        commonName = "Wax Plant",
        aliases = listOf(
            "Hoya",
            "Hindu Rope Plant",
            "Porcelain Flower",
            "Wax Vine",
            "Wax Flower"
        ),
        scientificName = "Hoya carnosa",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/e/ee/Hoyabella_092005.jpg",
        description = "Hoyas are evergreen perennial creepers or vines or rarely, shrubs. " +
                "They often grow epiphytically on trees; some grow terrestrially, or " +
                "occasionally in rocky areas. They climb by twining, and with the employment " +
                "of adventitious roots. Larger species grow 1–18 meters, or more, with suitable" +
                " support in trees. They have simple entire leaves, arranged in an " +
                "opposite pattern, that are typically succulent. Leaves may exhibit a " +
                "variety of forms, and may be smooth, felted or hairy; venation may be " +
                "prominent or not, and many species have leaf surfaces flecked with " +
                "irregular small silvery spots.",
        toxicStatus = PlantToxicity.NonToxic
    )

    val caeroba = Plant(
        plantId = 3,
        commonName = "Caeroba",
        aliases = listOf(
            "Rattle Snake Plant",
            "Peacock Plant",
            "Zebra Plant",
            "Prayer Plant"
        ),
        scientificName = "Calathea",
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/0d/CalatheaZebrina.jpg",
        description = "Calathea leaves are often large and colorfully patterned. The " +
                "leaves are often variegated with bright colors such as pink, orange, red, " +
                "and white.[4] The underside of their leaves are frequently purple. During" +
                " the night, the leaves fold up. In the morning, the leaves unfurl in search" +
                " of the morning sun. This phenomenon, known as nyctinasty, is made " +
                "possible by a small joint the plant possesses between the stem and " +
                "leaf, called a pulvinus.",
        toxicStatus = PlantToxicity.NonToxic
    )
}