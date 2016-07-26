package com.mygdx.hanoi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HanoiGame extends ApplicationAdapter {
	
	public final static String GAME_NAME = "Towers of Hanoi";
	private SpriteBatch batch;
	private BitmapFont font;
	private Texture background;

	
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		font.setColor(Color.BLACK);
		font.getData().setScale(2.3f);
		background = new Texture("background.png");
	}

	
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background,0,0);
		font.draw(batch, GAME_NAME, 280,440);
		batch.end();
	}

	
	public void dispose() {
		batch.dispose();
		font.dispose();

	}
}
