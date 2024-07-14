package orientada;

public class calculadora {
	  public int somar1(int a, int b, int c) {
	        return a + b + c;
	    }

	  public int somar2(int a, int b, int c) {
	        return a + b + c;}
	    
	  public int somar3(int a, int b, int c) {
	        return a + b + c;}
	  
	  public int subtrair1(int a, int b, int c) {
	        return a - b - c;
	    }

	  public int subtrair2(int a, int b, int c) {
	        return a - b - c;}
	    
	  public int subtrair3(int a, int b, int c) {
	        return a - b - c;}
	  
	  
	    public int multiplicar1(int a, int b, int c) {
	        return a * b * c;
	    }
	    
	    public int multiplicar2(int a, int b, int c) {
	        return a * b * c;
	    }
	    
	    public int multiplicar3(int a, int b, int c) {
	        return a * b * c;
	    }
	    
	    public double dividir1(int a, int b, int c) {

	        if (b == 0 || c == 0) {
	            System.out.println("n pode ser 0");
	        }
	        return (double) a/b/c;
	    }
	    
	    public double dividir2(int a, int b, int c) {

	        if (b == 0 || c == 0 || a == 0) {
	            System.out.println("n pode ser 0");
	        }
	        return (double) a/b/c;
	    }
	    
	    public double dividir3(int a, int b, int c) {

	        if (b == 0 || c == 0) {
	            System.out.println("n pode ser 0");
	        }
	        return (double) a/b/c;
	    }
	    
}
