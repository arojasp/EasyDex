package es.alejandro.easypokedex.data.remote.responses

data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)