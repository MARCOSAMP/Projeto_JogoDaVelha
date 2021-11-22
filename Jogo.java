package index;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		char[][] jogoDaVelha = new char[3][3];
		
		System.out.println("Jogador 1 = X ");
		System.out.println("Jogador 1 = O ");
		
		boolean ganhou = false;
		int jogada = 1;
		char sinal;
		int linha = 0, coluna = 0;
		
		while (!ganhou) {
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna de 1 a 3");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2. Escolha linha e coluna de 1 a 3");
				sinal = 'O';
			}
			
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a Linha (1, 2 ou 3)");
				linha = entrada.nextInt();
				if (linha > 0 && linha <= 3) {
					linhaValida = true;
				}else {
					System.out.println("Entrada inválida, tente novamente");
				}
				
				boolean colunaValida = false;
				while (!colunaValida) {
					System.out.println("Entre com a Coluna (1, 2 ou 3) ");
					coluna = entrada.nextInt();
					if (coluna > 0 && coluna <= 3) {
						colunaValida = true;
					}else {
						System.out.println("Entrada inválida, tente novamente");
					}
				}
				
				linha--;
				coluna--;
				if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
					System.out.println("Posição ja usada, tente novamente");
				}else {
					jogoDaVelha[linha][coluna] = sinal;
					jogada++;
				}
				
				for (int i = 0; i < jogoDaVelha.length; i++) {
					for (int j = 0; j < jogoDaVelha[i].length; j++) {
						System.out.print(jogoDaVelha[i][j] + " | ");
					}
					
					System.out.println();
				}
				if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || 
						(jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') ||
						(jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
						(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') ||
						(jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') ||
						(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') ||
						(jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') ||
						(jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {
					ganhou = true;
					System.out.println("Parabéns, jogador 1 ganhou!");
				} else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') || 
						(jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
						(jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
						(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
						(jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
						(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
						(jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
						(jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {
					ganhou = true;
					System.out.println("Parabéns, jogador 2 ganhou!");
				} if (jogada > 9) {
					ganhou = true;
					System.out.println("Ninguém ganhou essa partida");
				}
			}
		}

	}

}
