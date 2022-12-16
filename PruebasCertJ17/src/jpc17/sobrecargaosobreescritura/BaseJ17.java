package jpc17.sobrecargaosobreescritura;

import java.util.HashMap;
import java.util.Map;

class BaseJ17 {
	public <T extends Number, Z extends Number> Map<T, Z> getMap(T t, Z z) {
		return new HashMap<T, Z>();
	}
}
