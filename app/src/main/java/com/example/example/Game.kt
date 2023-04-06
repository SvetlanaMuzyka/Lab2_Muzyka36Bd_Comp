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
    val FullDescription: String,
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
            R.drawable.phasmophobia,
            "Phasmophobia is a cooperative psychological horror game developed by Kinetic Games. It was released in 2020 for Microsoft Windows and supports virtual reality headsets. The game has gained popularity for its unique and immersive gameplay, which allows players to experience the thrill of ghost hunting.\n" +
                    "\n" +
                    "In Phasmophobia, players take on the role of paranormal investigators tasked with collecting evidence of supernatural activity in various haunted locations. The game features a wide range of equipment and tools, including EMF readers, thermometers, and night vision cameras, which players can use to detect paranormal activity.\n" +
                    "\n" +
                    "As players progress through the game, they encounter different types of ghosts, each with its own unique characteristics and behavior. Some ghosts are aggressive and will attack players, while others are more elusive and difficult to detect. To successfully complete their investigations, players must work together to gather evidence and identify the type of ghost haunting the location.\n" +
                    "\n" +
                    "Phasmophobia's immersive gameplay and realistic graphics have made it a favorite among horror fans and gamers alike. With its innovative use of virtual reality technology, the game offers a truly terrifying experience that is sure to keep players on the edge of their seats."
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
            R.drawable.csgo,
            "Counter-Strike: Global Offensive (CS:GO) is a first-person shooter game developed by Valve Corporation and Hidden Path Entertainment. It is the fourth game in the Counter-Strike series, and it was released in 2012 for Windows, OS X, Xbox 360, and PlayStation 3. The game features two teams, terrorists and counter-terrorists, who compete against each other to complete objectives or eliminate the opposing team.\n" +
                    "\n" +
                    "CS:GO is one of the most popular esports games in the world, with millions of players competing in tournaments and leagues. The game has a strong focus on skill and strategy, requiring players to work together and communicate effectively to succeed. It also features a variety of weapons and equipment, each with its own strengths and weaknesses, allowing players to customize their playstyle.\n" +
                    "\n" +
                    "In addition to its competitive multiplayer mode, CS:GO also has a robust community of custom map and game mode creators, who have developed a wide range of content for the game. This includes everything from new weapons and skins to completely new game modes, such as zombie survival and battle royale.\n" +
                    "\n" +
                    "Overall, CS:GO is a highly addictive and challenging game that rewards skill and teamwork. Whether you're a casual player or a professional esports athlete, there's something for everyone in this classic shooter game."
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
            R.drawable.minecraft,
            "In Minecraft, players can also participate in multiplayer games with others, either on private servers or through online matchmaking. Additionally, the game has a strong modding community, with players able to create and share custom content and modifications to the game.\n" +
                    "\n" +
                    "One of the defining aspects of Minecraft is its block-based world, where nearly every object and material is made up of square blocks that can be broken down and collected by the player. These blocks can then be used to craft a variety of items, including tools, weapons, and building materials.\n" +
                    "\n" +
                    "Survival mode, as the name suggests, requires players to gather resources and fend off hostile mobs, all while managing their health and hunger levels. In contrast, creative mode gives players access to all of the game's resources and allows them to build and explore without any limitations.\n" +
                    "\n" +
                    "Adventure mode is a more structured experience, with players exploring custom-designed maps and completing objectives set by the map's creator. This mode can be played solo or with friends."
        )


    )

}