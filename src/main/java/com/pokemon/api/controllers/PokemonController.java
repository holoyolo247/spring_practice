package com.pokemon.api.controllers;

import com.pokemon.api.models.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class PokemonController {

    @GetMapping("pokemon")
    public ResponseEntity<List<Pokemon>> getPokemons(){
         List<Pokemon> pokemons= new ArrayList<>();
         pokemons.add(new Pokemon(1,"Pikachu","electricty"));
         pokemons.add(new Pokemon(2,"Squals","water"));
        pokemons.add(new Pokemon(3,"Charmander","fire"));

        return ResponseEntity.ok(pokemons);
    }


    @GetMapping("pokemon/{id}")
    public Pokemon pokemonDetail(@PathVariable int id){
        return new Pokemon(id, "Squiretle","water");
    }


    @PostMapping("pokemon/create")
    @ResponseStatus(HttpStatus.CREATED) // if it the create sucessfully.
    public ResponseEntity<Pokemon> createPokemon(@RequestBody Pokemon pokemon){
        //
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());
        return new ResponseEntity<>(pokemon,HttpStatus.CREATED);
    }

    @PutMapping("pokemon/{id}/update")
    public ResponseEntity<Pokemon> updatePokemon(@RequestBody Pokemon pokemon, @PathVariable("id") int pokemonId){
        System.out.println(pokemon.getName());
        System.out.println(pokemon.getType());
        return ResponseEntity.ok(pokemon);
    }

    @DeleteMapping("pokemon/{id}/delete")
    public ResponseEntity<String> deletePokemon(@PathVariable("id") int pokemonId){
        System.out.println(pokemonId);
        return ResponseEntity.ok("Pokemon deteted sucessfully");
    }

}



