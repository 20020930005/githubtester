package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Assets {

    public static Texture texture_back;
    public static Sprite sprite_back;

    public static void load(){


        texture_back = new Texture(Gdx.files.internal("java_logo##.jpg"));
        texture_back.setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
        sprite_back = new Sprite(texture_back);
        sprite_back.flip(false,true);
    }
}
