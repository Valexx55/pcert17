package jpc17.var;


import java.util.*;
class Student{ }  


/*
 * NO SE PUEDE DECLARAR var fuera de un método 
 * 
 * Si no declaras el <Tipo> al instanciar un array, 
 * no puedes acceder a un elemento como si fuera de ese tipo sin castearlo 
 * porque entiende que es de Objects 
 * 
 * El uso de la palabra reservada 
 * var var = "hola" sí se puede -cabrones-
 * 
 */
public class ErroresJ17 {

  // var students = new ArrayList<Student>(); //1

   public static void main(String[] args)  {

       var student  = new Student(); //2

       var allStudents = new ArrayList<Student>();  //3

       allStudents.add(student); //4
       
       for(var s : allStudents){ //5
          System.out.println(s);
       }
       Student s2 = allStudents.get(0); //6

       var var = "what?"; //7
   }

}
//Which lines will cause compilation error?


