package com.example.nestrecyclerview

object GameOfThroneData {
    val getData = listOf<GameOfThrones>(
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Jon Snow",slug = "jon"),
                GameOfThrones.Member(name = "Sansa Stark",slug = "sansa"),
                GameOfThrones.Member(name = "Eddard \"Ned\" Stark",slug = "ned"),
                GameOfThrones.Member(name = "Arya Stark",slug = "arya"),
                GameOfThrones.Member(name = "Bran Stark",slug = "bran"),
            ),
            slug = "stark",
            name = "House Stark of Winterfell"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Jaime Lannister",slug = "jaime"),
                GameOfThrones.Member(name = "Tyrion Lannister",slug = "sansa"),
                GameOfThrones.Member(name = "Cersei Lannister",slug = "ned"),
                GameOfThrones.Member(name = "Tywin Lannister",slug = "arya"),
                GameOfThrones.Member(name = "Bran Stark",slug = "bran"),
                GameOfThrones.Member(name = "Bran Stark",slug = "bran"),
            ),
            slug = "lannister",
            name = "House Lannister of Casterly Rock"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Joffrey Baratheon",slug = "jaime"),
                GameOfThrones.Member(name = "Robert Baratheon",slug = "sansa"),

            ),
            slug = "baratheon",
            name = "House Baratheon of Dragonstone"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Aerys II Targaryen",slug = "jaime"),
                GameOfThrones.Member(name = "Daenerys Targaryen",slug = "sansa"),
                GameOfThrones.Member(name = "Robert Baratheon",slug = "sansa"),

                ),
            slug = "baratheon",
            name = "House Targaryen of King's Landing"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Aerys II Targaryen",slug = "jaime"),
                GameOfThrones.Member(name = "Daenerys Targaryen",slug = "sansa"),
                GameOfThrones.Member(name = "Robert Baratheon",slug = "sansa"),

                ),
            slug = "baratheon",
            name = "House Greyjoy of Pyke"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Aerys II Targaryen",slug = "jaime"),
                GameOfThrones.Member(name = "Daenerys Targaryen",slug = "sansa"),

                ),
            slug = "baratheon",
            name = "House Tarly of Horn Hill"
        ),GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Aerys II Targaryen",slug = "jaime"),
                GameOfThrones.Member(name = "Daenerys Targaryen",slug = "sansa"),
                GameOfThrones.Member(name = "Robert Baratheon",slug = "sansa"),

                ),
            slug = "baratheon",
            name = "House Tarth of Evenfall Hall"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Ramsay Bolton",slug = "jaime")

                ),
            slug = "baratheon",
            name = "House Bolton of the Dreadfort"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Ramsay Bolton",slug = "jaime")

            ),
            slug = "baratheon",
            name = "House Baelish of Harrenhal"
        ),
        GameOfThrones(
            member = listOf<GameOfThrones.Member>(
                GameOfThrones.Member(name = "Olenna Tyrell",slug = "jaime")

            ),
            slug = "baratheon",
            name = "House Tyrell of Highgarden"
        )
    )
}