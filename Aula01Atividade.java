package aulaJPA.aula01;

import java.util.Scanner;

public class Aula01Atividade {

	public static void main(String[] args) {
		// Variáveis
		String nome;
		int idade;
		// Instaciar classe Scanner
		Scanner ler = new Scanner(System.in);

		// Entrada de dados
		System.out.println("Informe o nome: ");
		nome = ler.next();

		System.out.println("Informe a idade ");
		idade = ler.nextInt();

		// Saída
		System.out.println("O seu nome é : " + nome + " " +idade);

	}

}
