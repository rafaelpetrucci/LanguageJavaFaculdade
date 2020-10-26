package Meia_Piramide;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		String linha = new String(); // Criado uma variável do tipo String;
		Scanner entrada = new Scanner(System.in); // Criado uma variável do tipo Scanner, para entrada de dados;
		int contador = 1; int i = 0; int menor = 0; int soma = 0; int j = 0; // contadores auxiliares do programa;
		System.out.print("String: ");
		
		linha = entrada.nextLine(); // Digitado a linha de String com os números separados por espaço;
		entrada.close(); // Fechado a variável entrada do tipo Scanner, já que não será mais utilizada;
		
		String[] array = linha.split(" "); // É Criado um array do tipo String, com os valores digitados na "Linha", separando os valores nos indices por espaço, com a função split;
		int quantidade = array.length; // Quantidade de números digitados, e o tamanho do array;
		int menores[] = new int[quantidade]; // Criado um array do tipo inteiro, para ser guardado os menores numeros de cada linha da piramide;
		
		System.out.println("Quantidade: " + quantidade);
		System.out.println("-- PIRAMIDE --");
		System.out.println("-------------------------");
		
		while (i < quantidade) { // Um laço para passar por todos os números do array;
			for (int c = 0; c < contador && i < quantidade; c++) { // um for para passar por linha a linha, a variável contador serve para contar os números que estão aparecendo linha por linha;
				if (menor > Integer.parseInt(array[i])) { // verifica se a variável menor é maior do que o número atual do array;
					menor = Integer.parseInt(array[i]); // Caso seja maior, o valor menor recebe o número atual do array;
				}
				if (c == 0) { // Caso seja a primeira execução do laço;
					menor = Integer.parseInt(array[i]); // salvará o primeiro valor do array na variável menor;
					System.out.print("[" + array[i]);
				}
				else { // para os demais números seguintes;
					System.out.print(", " + array[i]); // printa o número atual do array;
				}
				i++; // incremento da variável, passando por cada número;
			}
			System.out.println("]");
			menores[j] = menor; // salva o menor valor descoberto no laço acima no array menores, no indice J;
			soma = soma + menor; // Faz a soma dos valores menores;
			j++; // variável para salvar no indice menores;
			contador++; // variável para contar a quantidade de números na próxima linha;
		}
		
		System.out.println("\n-------------------------");
		System.out.print("Os valores menores citados acima são: ");
		for (i = 0; i < j ; i++) { // enquanto i for menor que o J que é a variável que foi utilizada para salvar os valores no array menores;
			if (i == 0) { // Se for o primeiro laço;
				System.out.print("[" + menores[i]);
			}
			else { // Os demais;
				System.out.print(", " + menores[i]);
			}
		}
		System.out.println("]");
		System.out.println("A soma dos menores valores: " + soma);
	}

}
