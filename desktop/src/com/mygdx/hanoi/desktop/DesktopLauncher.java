package com.mygdx.hanoi.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.hanoi.HanoiGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = HanoiGame.GAME_NAME;
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new HanoiGame(), config);
	}
}
