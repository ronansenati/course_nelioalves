package course;

import java.util.Locale;
import java.util.Scanner;

public class S2Aula20Exerc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner (System.in);

		System.out.println("Entre com a medida do raio da circunfer�ncia:");
		double raio = sc.nextDouble();
		
		System.out.printf("�rea do c�rculo � igual a:%.4f%n", ((raio*raio)* 3.14159));		
		
		sc.close();
	}

}
