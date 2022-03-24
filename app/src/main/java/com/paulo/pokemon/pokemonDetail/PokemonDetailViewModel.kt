package com.paulo.pokemon.pokemonDetail

import androidx.lifecycle.ViewModel
import com.paulo.pokemon.data.remote.responses.Pokemon
import com.paulo.pokemon.repository.PokemonRepository
import com.paulo.pokemon.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return repository.getPokemonInfo(pokemonName)
    }
}