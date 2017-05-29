package com.battleship.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.Function;

import com.battleship.context.BattleShipContext;
import com.battleship.context.Context;

public class InputConvertor implements Function<Context, Properties> {

	@Override
	public Properties apply(Context t) {
		Properties prop = new Properties();
		try {
			BattleShipContext context = (BattleShipContext) t;
			File file = context.getBattleShipFile();
			InputStream stream = new FileInputStream(file);
			prop.load(stream);
			return prop;
		} catch (IOException e) {
			System.out.println("Exception occured" + e.getMessage());
		}
		return prop;

	}

}
