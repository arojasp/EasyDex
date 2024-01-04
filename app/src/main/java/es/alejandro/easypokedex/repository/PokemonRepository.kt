package es.alejandro.easypokedex.repository

import dagger.hilt.android.scopes.ActivityScoped
import es.alejandro.easypokedex.data.remote.PokeApi
import es.alejandro.easypokedex.data.remote.responses.Pokemon
import es.alejandro.easypokedex.data.remote.responses.PokemonList
import es.alejandro.easypokedex.util.Resource
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val api: PokeApi
){
    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            api.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred")
        }

        return Resource.Success(response)
    }

    suspend fun getPokemon(pokemonName: String): Resource<Pokemon> {
        val response = try {
            api.getPokemon(pokemonName)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred")
        }

        return Resource.Success(response)
    }
}