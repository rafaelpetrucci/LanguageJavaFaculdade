package Meia_Piramide;

import java.util.Scanner;

public class Piramide {

	public static void main(String[] args) {
		String linha = new String(); // Criado uma vari�vel do tipo String;
		Scanner entrada = new Scanner(System.in); // Criado uma vari�vel do tipo Scanner, para entrada de dados;
		int contador = 1; int i = 0; int menor = 0; int soma = 0; int j = 0; // contadores auxiliares do programa;
		System.out.print("String: ");
		
		linha = entrada.nextLine(); // Digitado a linha de String com os n�meros separados por espa�o;
		entrada.close(); // Fechado a vari�vel entrada do tipo Scanner, j� que n�o ser� mais utilizada;
		
		String[] array = linha.split(" "); // � Criado um array do tipo String, com os valores digitados na "Linha", separando os valores nos indices por espa�o, com a fun��o split;
		int quantidade = array.length; // Quantidade de n�meros digitados, e o tamanho do array;
		int menores[] = new int[quantidade]; // Criado um array do tipo inteiro, para ser guardado os menores numeros de cada linha da piramide;
		
		System.out.println("Quantidade: " + quantidade);
		System.out.println("-- PIRAMIDE --");
		System.out.println("-------------------------");
		
		while (i < quantidade) { // Um la�o para passar por todos os n�meros do array;
			for (int c = 0; c < contador && i < quantidade; c++) { // um for para passar por linha a linha, a vari�vel contador serve para contar os n�meros que est�o aparecendo linha por linha;
				if (menor > Integer.parseInt(array[i])) { // verifica se a vari�vel menor � maior do que o n�mero atual do array;
					menor = Integer.parseInt(array[i]); // Caso seja maior, o valor menor recebe o n�mero atual do array;
				}
				if (c == 0) { // Caso seja a primeira execu��o do la�o;
					menor = Integer.parseInt(array[i]); // salvar� o primeiro valor do array na vari�vel menor;
					System.out.print("[" + array[i]);
				}
				else { // para os demais n�meros seguintes;
					System.out.print(", " + array[i]); // printa o n�mero atual do array;
				}
				i++; // incremento da vari�vel, passando por cada n�mero;
			}
			System.out.println("]");
			menores[j] = menor; // salva o menor valor descoberto no la�o acima no array menores, no indice J;
			soma = soma + menor; // Faz a soma dos valores menores;
			j++; // vari�vel para salvar no indice menores;
			contador++; // vari�vel para contar a quantidade de n�meros na pr�xima linha;
		}
		
		System.out.println("\n-------------------------");
		System.out.print("Os valores menores citados acima s�o: ");
		for (i = 0; i < j ; i++) { // enquanto i for menor que o J que � a vari�vel que foi utilizada para salvar os valores no array menores;
			if (i == 0) { // Se for o primeiro la�o;
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
