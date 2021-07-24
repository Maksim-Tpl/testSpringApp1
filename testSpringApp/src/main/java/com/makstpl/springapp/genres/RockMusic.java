package com.makstpl.springapp.genres;

import com.makstpl.springapp.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "I'm Rock";
    }
}
