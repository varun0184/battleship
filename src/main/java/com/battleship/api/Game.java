package com.battleship.api;

import com.battleship.context.Context;

@FunctionalInterface
public interface Game {

	public void play(Context context);

}
