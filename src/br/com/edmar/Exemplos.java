package br.com.edmar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exemplos {

	public static void main(String[] args) {
		ex1();
		ex2();
	}

	private static void ex1() {
		System.out.println("***Exemplo 1***");
		Scanner s = new Scanner(System.in);
		System.out.println("Digite os nomes separados por vírgula: ");
		
		String nomes = s.nextLine();
		String [] nomesArray = nomes.split(",");
		
		for (int i = 0; i < nomesArray.length; i++) {
			nomesArray[i] = nomesArray[i].trim();
		}
		
		Arrays.sort(nomesArray);
		
		System.out.println("Segue abaixo os nome em ordem alfabética: ");
		for (String nome : nomesArray) {
			System.out.println(capitalize(nome));
		}	
	}
	
	private static void ex2() {
		Scanner s = new Scanner(System.in);
		ArrayList<String> homens = new ArrayList<>();
		ArrayList<String> mulheres = new ArrayList<>();
		
		System.out.println("Digite o nome e sexo separdos por virgur, como: nome - sexo, nome - sexo, ");
		String input = s.nextLine();
		
		String[] pares = input.split(",");
		
		for(String par : pares) {
			String[] partes = par.trim().split("-");
			
			if(partes.length == 2) {
				String nome = capitalize(partes[0].trim());
				String sexo = partes[1].trim().toUpperCase();
				
				if(sexo.equals("M")) {
					homens.add(nome + " - M");
				} else if(sexo.equals("F")) {
					mulheres.add(nome + " - F");
				} else {
					System.out.println("Sexo inválido em '" + par + "'. Por favor, use 'M' para masculino e 'F' para feminino." );
				}
			}
		}
		
		System.out.println("\nGrupo masculino: ");
		for(String homen: homens) {
			System.out.println(homen);
		}
		
		System.out.println("\nGrupo feminino: ");
		for(String mulher: mulheres) {
			System.out.println(mulher);
		}
		
	}

	private static String capitalize(String nome) {
        if (nome == null || nome.isEmpty()) {
            return nome;
        }
        return nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
    }

}
