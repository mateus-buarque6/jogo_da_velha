
// AUTHOR: MATEUS BUARQUE
// Date : 19/7/2016

package jogodavelha;

import java.util.Arrays;
import java.util.Scanner;


public class JogoDaVelha {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String m[][] = new String[3][3];
        m[0][0] = "1";
        m[0][1] = "2";
        m[0][2] = "3";
        m[1][0] = "4";
        m[1][1] = "5";
        m[1][2] = "6";
        m[2][0] = "7";
        m[2][1] = "8";
        m[2][2] = "9";
        int j = 9;
        int i = 0;
        while(i < j){
            i++;
            if (i % 2 == 1){
                System.out.println("========================");
                System.out.println("     JOGO DA VELHA      ");
                System.out.println("========================");
                System.out.println();
                System.out.println("     " + m[0][0] + "  |  " + m[0][1] + "  |  " + m[0][2]);
                System.out.println("--------+-----+--------");
                System.out.println("     " + m[1][0] + "  |  " + m[1][1] + "  |  " + m[1][2]);
                System.out.println("--------+-----+--------");
                System.out.println("     " + m[2][0] + "  |  " + m[2][1] + "  |  " + m[2][2]);
                System.out.println();
                System.out.println("Jogador [X] deseja jogar em qual posição:");
                int p = teclado.nextInt();
                if (p == 1){
                    m[0][0] = "X";
                }
                if (p == 2){
                    m[0][1] = "X";
                }
                if (p == 3){
                    m[0][2] = "X";
                }
                if (p == 4){
                    m[1][0] = "X";
                }
                if (p == 5){
                    m[1][1] = "X";
                }
                if (p == 6){
                    m[1][2] = "X";
                }
                if (p == 7){
                    m[2][0] = "X";
                }
                if (p == 8){
                    m[2][1] = "X";
                }
                if (p == 9){
                    m[2][2] = "X";
                }
                // NESTA LINHA VAI ENTRAR O COMANDO PARA LIMPAR A TELA
            }
            if (i % 2 == 0){
                System.out.println("========================");
                System.out.println("     JOGO DA VELHA      ");
                System.out.println("========================");
                System.out.println();
                System.out.println("     " + m[0][0] + "  |  " + m[0][1] + "  |  " + m[0][2]);
                System.out.println("--------+-----+------");
                System.out.println("     " + m[1][0] + "  |  " + m[1][1] + "  |  " + m[1][2]);
                System.out.println("--------+-----+------");
                System.out.println("     " + m[2][0] + "  |  " + m[2][1] + "  |  " + m[2][2]);
                System.out.println();
                System.out.println("Jogador [O] deseja jogar em qual posição:");
                int p = teclado.nextInt();
                if (p == 1){
                    m[0][0] = "O";
                }
                if (p == 2){
                    m[0][1] = "O";
                }
                if (p == 3){
                    m[0][2] = "O";
                }
                if (p == 4){
                    m[1][0] = "O";
                }
                if (p == 5){
                    m[1][1] = "O";
                }
                if (p == 6){
                    m[1][2] = "O";
                }
                if (p == 7){
                    m[2][0] = "O";
                }
                if (p == 8){
                    m[2][1] = "O";
                }
                if (p == 9){
                    m[2][2] = "O";
                }
                //NESTA LINHA VAI ENTRAR O COMANDO PARA LIMPAR A TELA
            }
            if (((m[0][0].equals(m[1][0])) && (m[1][0].equals(m[2][0]))) ^ (((m[0][1].equals(m[1][1])) && (m[1][1].equals(m[2][1])))) ^ (((m[0][2].equals(m[1][2])) && (m[1][2].equals(m[2][2])))) ^ (((m[0][0].equals(m[1][1])) && (m[1][1].equals(m[2][2])))) ^ (((m[1][2].equals(m[1][1])) && (m[1][1].equals(m[2][0])))) ^ (((m[0][0].equals(m[0][1])) && (m[0][1].equals(m[0][2])))) ^ (((m[1][0].equals(m[1][1])) && (m[1][1].equals(m[1][2])))) ^ (((m[2][0].equals(m[2][1])) && (m[2][1].equals(m[2][2]))))) {  
                j = i;
                break;
            }                        
        }
        if (j == 9){
            System.out.println("=================");
            System.out.println("    RESULTADO    ");
            System.out.println("=================");
            System.out.println();
            System.out.println("EMPATE");
        }else if (j % 2 == 1) {
            System.out.println("=================");
            System.out.println("    RESULTADO    ");
            System.out.println("=================");
            System.out.println();
            System.out.println("VITÓRIA DO JOGADOR 1 [X]");
        }else if (j % 2 == 0){
            System.out.println("=================");
            System.out.println("    RESULTADO    ");
            System.out.println("=================");
            System.out.println();
            System.out.println("VITÓRIA DO JOGADOR 2 [O]");
        }
    }
}
