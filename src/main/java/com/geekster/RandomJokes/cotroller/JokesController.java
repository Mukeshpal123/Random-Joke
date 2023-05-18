package com.geekster.RandomJokes.cotroller;

import com.geekster.RandomJokes.model.Joke;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class JokesController {

    private final Joke[] jokes = {
            new Joke(1, "Why don't scientists trust atoms? Because they make up everything!"),
            new Joke(2, "Did you hear about the mathematician who's afraid of negative numbers? He will stop at nothing to avoid them!"),
            new Joke(3, "Why did the scarecrow win an award? Because he was outstanding in his field!")
            // Add more jokes to the array
    };

    @GetMapping("/random-joke")
    public Joke getRandomJoke() {
        int randomIndex = new Random().nextInt(jokes.length);
        return jokes[randomIndex];
    }
}
