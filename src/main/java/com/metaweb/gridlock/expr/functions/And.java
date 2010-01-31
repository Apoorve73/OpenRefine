package com.metaweb.gridlock.expr.functions;

import java.util.Properties;

import com.metaweb.gridlock.expr.Function;

public class And implements Function {

	@Override
	public Object call(Properties bindings, Object[] args) {
		for (Object o : args) {
			if (!Not.objectToBoolean(o)) {
				return false;
			}
		}
		return true;
	}
}
