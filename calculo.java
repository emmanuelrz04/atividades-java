package orientada;

public class calculo {

	public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		System.out.println("a soma de a,b e c são:" + " " + calculadora.somar1(10, 10,10));
		System.out.println("a soma de a,b e c são:" + " " +  calculadora.somar2(10, 10,10));
		System.out.println("a soma de a,b e c são:" + " " +  calculadora.somar3(1, 20, 30));
		System.out.println("                                              ");
		System.out.println("a subtração de a,b e c são:" + " " +  calculadora.subtrair1(10, 10,1));
		System.out.println("a subtração de a,b e c são:" + " " +  calculadora.subtrair2(10, 10,2));
		System.out.println("a subtração de a,b e c são:" + " " +  calculadora.subtrair3(1, 20, 30));
		System.out.println("                                              ");
		System.out.println("a multiplicação de a,b e c são:" + " " +  calculadora.multiplicar1(4, 5,7));
		System.out.println("a multiplicação de a,b e c são:" + " " +  calculadora.multiplicar1(10, 10,7));
		System.out.println("a multiplicação de a,b e c são:" + " " +  calculadora.multiplicar1(10, 10,7));
		System.out.println("                                              ");
		System.out.println("a divisão de a,b e c são:" + " " +  calculadora.dividir1(4, 5,7));
		System.out.println("a divisão de a,b e c são:" + " " +  calculadora.dividir2(10, 10,7));
		System.out.println("a divisão de a,b e c são:" + " " +  calculadora.dividir3(10, 10,7));
    }
	}



