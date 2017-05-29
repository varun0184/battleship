package com.battleship.util;

import java.util.function.Function;

public interface InputMapper {

	public static <F, T> T transform(F fromData, Function<? super F, ? extends T> function) {

		return function.apply(fromData);
	}

}
