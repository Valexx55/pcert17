package jcp17.clasicas;

public class PruebaStringsIntern {
	
	public static void main(String[] args) {

//What will the following code print?

        String examName = "OCP Java 11";
        String uniqueExamName = new String(examName);
        String internedExamName = uniqueExamName.intern();
        System.out.println(
                (examName==uniqueExamName)+" "+
                (examName == internedExamName)+" "+
                (uniqueExamName == internedExamName) );

	}

}

//esto devuelve false true false
//dos Strings con id�ntico contenido pueden ser objetos distintos si se instancian por separado
//el m�todo intenr hace que si un String ya existe con ese contenido, se reasigna ese objeto 
//(el primero de ellos de los que fue declarado así además)
