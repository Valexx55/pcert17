package jcp17.sealed;

//package jcp18; //el expertimento permite declarar la clase sellada en 
//un paquete distinto al de sus hijas....la teoría dice que no


import jcp17.sealed.p1.CompoundIntCalculator;

  


/*
CON sealed (sellada) una clase padre determina explícitamente quién
puede heredar de ella. Es habitual que una clase sellada se abstracta a su vez.

1. sintaxis
<visibilidad> <abstract> sealed class Nombre permits Nombre1, Nombre2 {} //selad antes que class EN ESE ORDEN

2. la clase que hereada debe poner
final, sealed o non-selead en su declaración, para, respectivamente:

con final impedir la herencia, 
con selaed permitir la herencia a otros subtipos explícitamnete
y con non-sealed no limitarla

3. si la subclase es a su vez sealed, debe siempre llevar la claúsula permits

4. la clase legitimadas a heredar, deben hacerlo y usar extends en su definición
si no, peta

5. la clase sellada debe estar declarada en el MISMO PAQUETE que sus subclases

6. Pero ojo, en relación con 5., si están en un módulo con el mismo nombre, 
(module-name) sí se permite que estén en distintos paquetes

7. Permits puede omitirse si estás declarando la clase sellada y la hija
en el mismo archivo (como anidada o 2 top level) No así en ficheros separados.

 7.1 De hecho, se recomienda omitir permits en el caso de clases anidadas
 porque sino, hay que nombrar la clase permitidas con punto como:
 	
 	sealed class Padre permits Padre.Hijo {
 		final classs Hijo extends Padre
 	}
 	
 	//omitiendo
 	sealed class Padre {
 		final classs Hijo extends Padre
 	}
 	
 8. También se puede usar sealed en Interfaces para limitar su uso. 
 En cuyo caso se hace permits sobre clases que implementen esa interfaz o interfaces 
 que hereden de esa interfaz.
 
 9. En caso de que una interfaz herede de otra interfaz sellada, esta subinterfaz 
 solo puede marcarse con sealed o non-sealed y no como final, puesto que una
 interfaz es implícitamente abstract
 
 NOTA: El uso de selaed clases permite que en un swtich de clase sealed padre
 evitar el uso de default - porque el comipaldor conece de antemano todos los 
 subtipos posibles -  En caso contrario (sin sealed clases) debería ponerse un
 default para que compilara. _chorrada preview de Java17-
 * 
 */
//public sealed class InterestCalculator permits CompoundIntCalculator1{ }
public sealed class InterestCalculator permits CompoundIntCalculator{ }

//fallaría porque una clase que hereda de una sealed
//class debe tener final, sealed o non-sealed
//public class CompoundIntCalculator extends InterestCalculator{ }

//funciona
//non-sealed abstract class CompoundIntCalculator extends InterestCalculator{ }

//funciona
//final class CompoundIntCalculator extends InterestCalculator{ }

//funciona
//public non-sealed class CompoundIntCalculator extends InterestCalculator{ }