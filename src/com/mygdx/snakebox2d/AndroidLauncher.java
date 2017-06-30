package com.mygdx.snakebox2d;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.kingsnake.screens.KingSnake;
import com.mygdx.snakebox2d.SnakeBox2d;

public class AndroidLauncher extends AndroidApplication {
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		//initialize(new SnakeBox2d(), config);
		initialize(new KingSnake(), config);
	}
}
