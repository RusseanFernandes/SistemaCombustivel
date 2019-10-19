package aulas;

import java.util.Scanner;

class principal {

	public static void main(String[] args) {

		
			// TODO Auto-generated method stub
			System.out.println("Sistema de Controle de Combustível");
			System.out.println("1-Entrada de dados:");
			System.out.println("2-Relatórios:");
			System.out.println("3-Sair");
			
			Scanner sc = new Scanner (System.in);
			
			int op = sc.nextInt();
			
			if (op ==1) {
				System.out.println("Digite Nome");
				String nome = sc.next();
				
				System.out.println("KM Rodado");
				
				float kmrodado = sc.nextFloat();
						
				System.out.println("digite o litro");
				float litros = sc.nextFloat();
				
				//teste
			}
			
			
		}

		
}
