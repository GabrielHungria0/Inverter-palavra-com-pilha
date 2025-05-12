package com.mycompany.pilha;
import java.util.Scanner;
import java.util.Stack;

public class EstruturaDeDados {

    public static void main(String[] args) {
        String nome;
        String nomeInvertido = "";
        Scanner scanner = new Scanner(System.in);
        nome = scanner.nextLine();
  
        String[] listaNomes = nome.trim().split("\\s+");

        Pilha<String> pilha = new Pilha<>(nome.length());

        for (int i = listaNomes.length - 1; i >= 0; i--) {
            String nomeAtual = listaNomes[i];
            int tamanho = nomeAtual.length();

            for (int j = 0; j < tamanho; j++) {
                pilha.push(nomeAtual.substring(j, j + 1));
            }

            if (i > 0) {
                pilha.push(" ");
            }
        }

        while (!pilha.vazia()) {
            nomeInvertido += pilha.elementoDoTopo();
            pilha.pop();
        }
        System.out.println("\nPILHA COM MINHA IMPLEMENTACAO:");
        System.out.println(nomeInvertido);
        
        nomeInvertido = "";
        Stack<String> pilhaImplementada = new Stack<>();
     
        for (int i = listaNomes.length - 1; i >= 0; i--) {
            String nomeAtual = listaNomes[i];
            int tamanho = nomeAtual.length();

            for (int j = 0; j < tamanho; j++) {
                pilhaImplementada.push(nomeAtual.substring(j, j + 1));
            }

            if (i > 0) {
                pilhaImplementada.push(" ");
            }
        }
        
         while (!pilhaImplementada.empty()) {
            nomeInvertido += pilhaImplementada.peek();
            pilhaImplementada.pop();
        }
         System.out.println("\nPILHA JA IMPLENENTADA:");
         System.out.println(nomeInvertido);
    }
}
