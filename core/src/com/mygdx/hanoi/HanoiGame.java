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
	
	private Texture block1;
	private Texture block2;
	private Texture block3;
	
	private GameObject disc1;
	private GameObject disc2;
	private GameObject disc3;

	
	public void create() {
		batch = new SpriteBatch();
		font = new BitmapFont();
		
		font.setColor(Color.BLACK);
		
		font.getData().setScale(2.3f);
		
		background = new Texture("background.png");
		block1 = new Texture("Disc1.png");
		block2 = new Texture("Disc2.png");
		block3 = new Texture("Disc3.png");
		
		disc1= new GameObject(block1);
		disc2= new GameObject(block2);
		disc3= new GameObject(block3);
		
		disc1.x=92;
		disc1.y=19;
		
		disc2.x=118;
		disc2.y=27;
		
		disc3.x=138;
		disc3.y=37;
	}

	
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background,0,0);
		font.draw(batch, GAME_NAME, 280,440);
		batch.draw(block1,100,0);
		batch.draw(block2,200,0);
		batch.draw(block3,300,0);
		batch.end();
	}

	
	public void dispose() {
		batch.dispose();
		font.dispose();

	}
}
