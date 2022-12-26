package jcp17.clasicas;

public class SwitchCasos {
	
	public static int getSwitch(int x){
	      return x - 20/x + x*x; //esto se castea automácamente como un INT!!!!
	   }
	   public static void main(String args[]){
	       switch( getSwitch(10) ){
	          case 1 :
	          case 2 :
	          case 3 :
	          default : break;
	       }
	   }

}
