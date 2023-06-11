package jcp17.clasicas.other;

public class KitchenSkin {
    private int numForks;

    public static void main(String[] args) {
       int numKnives;
       System.out.print("""
          "# forks = " + numForks +
           " # knives = " + numKnives +
          # cups = 0""");
       
       String bac = "HOLA";
       String bac1 = "HOLA";
       
       if (bac == bac1)
    	   System.out.println("Son iguales");
       
       
       var base = "ewe\nsheep\\t";
       System.out.println(base);
       int length = base.length();
       int indent = base.indent(2).length();
       System.out.println(base);
       int translate = base.translateEscapes().length();
       System.out.println(base);

       var formatted = "%s %s %s".formatted(length, indent, translate);
       System.out.format(formatted);
    }
}