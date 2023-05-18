package com.geekster.RandomJokes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Joke {
    private int jokeId;
    private String content;
}
