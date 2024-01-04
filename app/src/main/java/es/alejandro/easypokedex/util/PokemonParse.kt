package es.alejandro.easypokedex.util

import androidx.compose.ui.graphics.Color
import es.alejandro.easypokedex.data.remote.responses.Stat
import es.alejandro.easypokedex.data.remote.responses.Type
import es.alejandro.easypokedex.ui.theme.AtkColor
import es.alejandro.easypokedex.ui.theme.DefColor
import es.alejandro.easypokedex.ui.theme.HPColor
import es.alejandro.easypokedex.ui.theme.SpAtkColor
import es.alejandro.easypokedex.ui.theme.SpDefColor
import es.alejandro.easypokedex.ui.theme.SpdColor
import es.alejandro.easypokedex.ui.theme.TypeBug
import es.alejandro.easypokedex.ui.theme.TypeDark
import es.alejandro.easypokedex.ui.theme.TypeDragon
import es.alejandro.easypokedex.ui.theme.TypeElectric
import es.alejandro.easypokedex.ui.theme.TypeFairy
import es.alejandro.easypokedex.ui.theme.TypeFighting
import es.alejandro.easypokedex.ui.theme.TypeFire
import es.alejandro.easypokedex.ui.theme.TypeFlying
import es.alejandro.easypokedex.ui.theme.TypeGhost
import es.alejandro.easypokedex.ui.theme.TypeGrass
import es.alejandro.easypokedex.ui.theme.TypeGround
import es.alejandro.easypokedex.ui.theme.TypeIce
import es.alejandro.easypokedex.ui.theme.TypeNormal
import es.alejandro.easypokedex.ui.theme.TypePoison
import es.alejandro.easypokedex.ui.theme.TypePsychic
import es.alejandro.easypokedex.ui.theme.TypeRock
import es.alejandro.easypokedex.ui.theme.TypeSteel
import es.alejandro.easypokedex.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.lowercase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.lowercase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.lowercase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}