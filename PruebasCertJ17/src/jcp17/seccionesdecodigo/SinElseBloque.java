package jcp17.seccionesdecodigo;


//What will the following program print when run without any command line argument?

public class SinElseBloque {
    public static void main(String[] args)  {

        var hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }
        
        {
            System.out.println("no params");
        }
    }
}
