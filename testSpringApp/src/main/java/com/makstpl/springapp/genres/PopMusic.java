package com.makstpl.springapp.genres;

import com.makstpl.springapp.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "Faradenza";
    }
}
