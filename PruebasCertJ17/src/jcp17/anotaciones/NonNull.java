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

//los rojos no s� c�mo quitarlos ni qu� significan...esperando ver la soluci�n
@Retention(value=RUNTIME)
@Target(value={TYPE_USE,TYPE_PARAMETER})
public @interface NonNull {

}
