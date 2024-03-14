package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.GL20;

import static com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT;
import static com.badlogic.gdx.graphics.GL20.GL_TEXTURE10;

public class GameScreen implements Screen {

    MyGame game;
    OrthographicCamera camera;
    SpriteBatch batch;


    public GameScreen(MyGame game){
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(true,1920,1080);

        batch = new SpriteBatch();

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(.95f,.95f,.95f,.95f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();

        batch.setProjectionMatrix(camera.combined);

        batch.begin();
            batch.draw(Assets.sprite_back, 0, 0);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
