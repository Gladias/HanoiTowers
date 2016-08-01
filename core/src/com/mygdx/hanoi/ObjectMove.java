package com.mygdx.hanoi;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;

public class ObjectMove {

	public static float Click(float ObjectX, float ObjectY, int ObjectID) {
		
		if (Gdx.input.justTouched()) {
			
			if (ObjectY == 300) {
				switch (ObjectID) {
				case 1:
					ObjectY = 105;
					break;

				case 2:
					ObjectY = 80;
					break;

				case 3:
					ObjectY = 45;
					break;

				}

			}
			
			else ObjectY=300;

		}

		return ObjectY;

	}

}
