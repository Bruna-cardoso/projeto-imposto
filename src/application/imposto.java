package application;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double impostosalario, impostoservicos, impostocapital, salario, salariomensal, servicos, capital, gastosm, gastose;
		
		// Leitura dos dados
		System.out.println("Renda anual com sal�rio:");
		salario = sc.nextDouble();
		
		System.out.println("Renda anual com presta��o de servi�o:");
		servicos = sc.nextDouble();
		
		System.out.println("Renda anual com ganho de capital:");
		capital = sc.nextDouble();
		
		System.out.println("Gastos m�dicos:");
		gastosm = sc.nextDouble();
		
		System.out.println("Gastos educacionais:");
		gastose = sc.nextDouble();
		
		sc.close();

	}

}
