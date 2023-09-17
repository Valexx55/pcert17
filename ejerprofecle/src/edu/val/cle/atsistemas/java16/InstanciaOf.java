package edu.val.cle.atsistemas.java16;

public class InstanciaOf {
	
	public static void main(String[] args) {

        String obj = "jdk14";
        Object obj1 = obj;

        // Before Java 14
        if (obj1 instanceof String) {            // instanceof
            String s = (String) obj;            // cast
            if ("jdk14".equalsIgnoreCase(s)) {
                System.out.println(obj);
            }
        } else {
            System.out.println("not a string");
        }

        // Now Java 14
        if (obj1 instanceof String s) {          // instanceof, cast and bind variable in one line.
            if ("jdk14".equalsIgnoreCase(s)) {
                System.out.println(obj);
            }
        } else {
            System.out.println("not a string");
        }

    }

}
