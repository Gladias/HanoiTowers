package com.mygdx.hanoi;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class GameObject extends Rectangle{
	
	public int id;

	public GameObject(Texture block) {
		setTexture(block);
	}

	public void setTexture(Texture texture) {
	}

}
