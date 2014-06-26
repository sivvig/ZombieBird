package com.kilobolt.gameworld;

import com.kilobolt.gameobjects.Bird;

public class GameWorld {
	
	private Bird bird;
	
	public GameWorld(int midPointY) {
		bird = new Bird(33, midPointY - 5, 17, 12);
	}
	
	public void update(float delta) {
		bird.update(delta);
    }
	
	public Bird getBird() {
		return bird;
	}

}
