package com.mygdx.game;

import com.badlogic.gdx.Game;

import static com.mygdx.game.Assets.load;

public class MyGame extends Game {

    public GameScreen game_screen;



    @Override
    public void create() {

        load();
        game_screen = new GameScreen(this);

        setScreen(game_screen);
    }
}
