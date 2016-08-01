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
	
	public GameObject disc1;
	public GameObject disc2;
	public GameObject disc3;

	
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
		
		disc1.x=152;
		disc1.y=105;
		disc1.id=1;
		
		disc2.x=140;         // <- start values
		disc2.y=80;
		disc2.id=2;
		
		disc3.x=130;
		disc3.y=45;
		disc3.id=3;
	}

	
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(background,0,0);
		font.draw(batch, GAME_NAME, 280,440);
		
		if (disc1.y > disc2.y && disc1.y > disc3.y)
			disc1.y=ObjectMove.Click(disc1.x,disc1.y,disc1.id);
		
		else if (disc2.y > disc1.y && disc2.y > disc3.y)
			disc2.y=ObjectMove.Click(disc2.x,disc2.y,disc2.id);
		
		else
			disc3.y=ObjectMove.Click(disc3.x,disc3.y,disc3.id);
		
		batch.draw(block1,disc1.x,disc1.y);
		batch.draw(block2,disc2.x,disc2.y);
		batch.draw(block3,disc3.x,disc3.y); 
		
		batch.end();
	}

	
	public void dispose() {
		batch.dispose();
		font.dispose();

	}
}
