package Aplicação;

import java.util.InputMismatchException;
import java.util.Scanner;

public class a1 {

        public static void main(String[] args) {
            metodo1();
            System.out.println("Fim de programa");
        }
        public static void metodo1() {
            System.out.println("***METODO1 COMEÇAR***");
            metodo2();
            System.out.println("***METODO1 FIM***");
        }
        public static void metodo2() {
            System.out.println("***METODO2 COMEÇAR***");
            Scanner sc = new Scanner(System.in);
            try {
                String[] vetor = sc.nextLine().split(" ");
/*  |--------------------------------------------|
    |
    |--------> "String[] vetor = sc.nextLine().split(" ");" significa que vai ler vários dados
                na mesma linha por um espaço em branco.

 */
                int posição = sc.nextInt();
                System.out.println(vetor[posição]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Posição inválida!");
                e.printStackTrace();
/*              |
                |---> vai imprimir na tela o rastreamento do Stack, ou seja, mapear todos os
                      percursos até achar o erro inicial q provocou outros erros.
 */
                sc.next();
            }
            catch (InputMismatchException e) {
                System.out.println("Erro de entrada");
            }
            sc.close();
            System.out.println("***METODO2 FIM***");
   }
}
