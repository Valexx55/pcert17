package jcp17.clasicas;

public class TestLoad {
	
	 public static void main(String[] args) throws Exception {
		 TestLoad t = new TestLoad();
         int i = t.getLoad();
         double d = t.getLoad();
         System.out.println( i + d );
         
    }

    public int getLoad() {
        return 1;
    }

    public double getLoad(){ 
        return 3.0;
    }

}
