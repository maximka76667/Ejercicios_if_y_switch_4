package triangulos;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("a: ");
		double a = entrada.nextDouble();
		
		System.out.println("b: ");
		double b = entrada.nextDouble();
		
		System.out.println("c: ");
		double c = entrada.nextDouble();
		
		// Triangulo o no
		boolean isTriangulo = true;
		double mayor_lado;
		double lado2;
		double lado3;
		
		if(b > a && b > c) isTriangulo = checkIsTriangulo(mayor_lado = b, lado2 = a, lado3 = c);
		else if (c > a && c > b) isTriangulo = checkIsTriangulo(mayor_lado = c, lado2 = a, lado3 = b);
		else isTriangulo = checkIsTriangulo(mayor_lado = a, lado2 = b, lado3 = c);
		
		String tipo_triangulo = "Imposible";
		
		// Si triangulo clasificar tipo
		if(isTriangulo) {
			double cos_angulo;
			cos_angulo = (Math.pow(lado2, 2) + Math.pow(lado3, 2) - Math.pow(mayor_lado, 2)) / (2 * lado2 * lado3);
			
			if(cos_angulo == 0) tipo_triangulo = "Rectangulo";
			else if(cos_angulo > 0) tipo_triangulo = "Acutangulo";
			else if(cos_angulo < 0) tipo_triangulo = "Obtusangulo";
		}
		
		// Print tipo
		System.out.println(tipo_triangulo);
		
		entrada.close();
	}
	
	public static boolean checkIsTriangulo(double mayor, double lado2, double lado3) {
		if(mayor >= lado2 + lado3) return false;
		return true;
	}

}
