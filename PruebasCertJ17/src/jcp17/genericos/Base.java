package jcp17.genericos;

import java.util.ArrayList;
import java.util.Collection;

public class Base {

	public <T> Collection<T> transform(Collection<T> list) {
		return new ArrayList<T>();
	}
}
