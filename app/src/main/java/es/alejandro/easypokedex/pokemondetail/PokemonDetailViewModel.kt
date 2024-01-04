package es.alejandro.easypokedex.pokemondetail

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import es.alejandro.easypokedex.data.remote.responses.Pokemon
import es.alejandro.easypokedex.repository.PokemonRepository
import es.alejandro.easypokedex.util.Resource
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemon(pokemonName)
    }

}