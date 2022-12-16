package jcp17.clasicas;

public class MatchDiviionesEnteras {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int dx, dy;
        try{
            dx = x % 5;//OJO DIVISIO POR CERO
            dy =  y/dx;
        }catch(ArithmeticException ae){
            System.out.println("Caught AE");
            dx = 2;
            dy = y/dx;//10
        }
        x = x/dx;//5
        y = y/dy;//2
        System.out.println(dx+" "+dy);
        System.out.println(x+" "+y);
        
    }
    //Caught AE
    //2 10
    //5 2 sería la salida
}
