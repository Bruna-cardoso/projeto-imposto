package application;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double impostosalario, impostoservicos, impostocapital, salario, salariomensal, servicos, capital, gastosm, gastose, impostobruto, gastostotal, dedutivel, maxdedutivel, impostototal;
		
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
		
		// Consolidado de renda
		
					// Imposto sal�rio 
				
					salariomensal = salario / 12;
					
					if (salariomensal >= 3000.00 && salariomensal < 5000.00 ) {
						impostosalario = salario * 0.10;
					}
					else if (salariomensal >= 5000.00) {
						impostosalario = salario * 0.20;
					}
					else {
						impostosalario = 0.00;
					}
					
					// Imposto presta��o de servi�os
					if (servicos != 0.00) {
						impostoservicos = servicos * 0.15;
					}
					else {
						impostoservicos = 0.00;
					}
					
					// Imposto ganho de capital
					if (capital != 0.00) {
						impostocapital = capital * 0.20;
					}
					else {
						impostocapital = 0.00;
					}
					
		System.out.println();	
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostosalario);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoservicos);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostocapital);
		
		// Deducoes
		
		gastostotal = gastosm + gastose;
		impostobruto = impostosalario + impostoservicos + impostocapital;
		maxdedutivel = impostobruto * 0.30;
		
		if (gastostotal > maxdedutivel) {
			dedutivel = maxdedutivel;
		}
		else {
			dedutivel = gastostotal;
		}
		
		System.out.println();
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maxdedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastostotal);
		
		// Relatorio finalizado
		
		impostototal = impostobruto - dedutivel;
		
		System.out.println();
		System.out.printf("Imposto bruto total: %.2f%n", impostobruto);
		System.out.printf("Abatimento: %.2f%n", dedutivel);
		System.out.printf("Imposto devido: %.2f%n", impostototal);
		
		sc.close();

	}

}
