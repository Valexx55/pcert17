package jpc17.sobrecargaosobreescritura;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 genéricos:
 
 al usarlos en //1, da otra versión, no sobreescribe el método padre sino que da otra alternativa 
 */
public class DerivedJ17 extends BaseJ17 {

	public <T, Z> TreeMap<T, Z> getMap(T t, Z z) {
		return new TreeMap<T, Z>();//1 -- SOBRECARGA - overload- (da otra versión / posibilidad)
	};

	public Map<Number, Number> getMap(Number t, Number z) {
		return new TreeMap<Number, Number>();//2 -- SOBREESCRIBE - override (da su versión)
	};

	/*
	public Map<Integer, Integer> getMap(Number t, Number z) 
	{ return new HashMap<Integer, Integer>(); }; //3 -- SOBREESCRIBE - override (da su versión)
	*/

}
