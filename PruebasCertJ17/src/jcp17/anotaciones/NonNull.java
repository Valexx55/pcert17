/**
 * 
 */
package jcp17.anotaciones;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author valer
 *
 */

//los rojos no sé cómo quitarlos ni qué significan...esperando ver la solución
@Retention(value=RUNTIME)
@Target(value={TYPE_USE,TYPE_PARAMETER})
public @interface NonNull {

}
