package com.example.example

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    val name: String,
    val ReleaseDate: Int,
    val Company: String,
    val Genre: String,
    val Description: String,
    val ResId: Int,
) : Parcelable

fun createGames(): List<Game> {
    return listOf(
        Game(
            "Phasmophobia",
            2020,
            "Kinetic Games",
            "Horror",
            "Phasmophobia is a cooperative  psychological horror game developed by Kinetic Games. " +
                    "It was released in 2020 for Microsoft Windows and supports virtual reality headsets. The game " +
                    "takes place in various haunted locations and players take  on the role of paranormal" +
                    " investigators tasked with collecting evidence of supernatural activity.",
            R.drawable.phasmophobia
        ),

        Game(
            "CS:GO",
            2012,
            "Valve Corporation",
            "FPS",
            "Counter-Strike: Global Offensive (CS:GO) is a first-person " +
                    "shooter game developed by Valve Corporation and Hidden Path Entertainment. It is the fourth game in the" +
                    " Counter-Strike series, and it was released in 2012 for Windows, OS X, Xbox 360, and PlayStation 3. The game " +
                    "features two teams, terrorists and counter-terrorists," +
                    " who compete against each other to complete objectives or eliminate the opposing team.",
            R.drawable.csgo
        ),

        Game(
            "Minecraft",
            2011,
            "Mojang Studios",
            "Survival, sandbox, exploration",
            "Minecraft is a sandbox video game that was first released in 2011. Developed by Mojang " +
                    "Studios, the game allows players to explore a blocky, procedurally-generated 3D world and to craft tools, " +
                    "weapons, and buildings from the materials they collect. Minecraft features multiple game modes, " +
                    "including survival mode, creative mode," +
                    " and adventure mode, each with its own unique gameplay mechanics and challenges. ",
            R.drawable.minecraft
        )


    )

}