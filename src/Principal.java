/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Página 40 Thomas H. Cormen 3 ed
 *
 * Algoritmo BubbleSort
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 * 
 */

/**
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Realiza a troca de posição de dois elementos do vetor.
     *
     * @param A Vetor que contém os dados
     * @param i Primeira posição de troca
     * @param j Segunda posição de troca
     */
    public static void troca(int[] A, int i, int j) {
        int aux = A[i];
        A[i] = A[j];
        A[j] = aux;
    }

    /**
     * BubbleSort
     *
     * É um algoritmo de ordenação muito popular, mas muito ineficiente.
     *
     * Ele funciona permutando repetidamente elementos adjacentes que estão fora
     * de ordem.
     *
     * Um método de ordenação é estável se elementos iguais ocorrem no vetor
     * ordenado na mesma ordem em que são passados na entrada. O BubbleSort é
     * estável.
     *
     * Complexidade O(n^2) 
     * Espaço O(1)
     *
     * @param A Vetor a ser ordenado
     * @param n Quantidade de elementos do vetor
     */
    public static void bubbleSort(int A[]) {
        for (int i = 1 - 1; i <= A.length - 1 - 1; i++) {           //Theta(n)
            for (int j = A.length - 1; j >= i + 1; j--) {           //n * Theta(n)
                if (A[j] < A[j - 1]) {                              //Theta(n)
                    troca(A, j, j - 1);                             //O(n)
                }
            }
        }
    }

    public static void main(String args[]) {

        //Vetor dos dados        
        int A[] = {50, 70, 60, 90, 10, 30, 20, 40};

        //Fim do vetor
        int r = A.length;

        System.out.println(">>> Algoritmo BubbleSort/Ordenação pelo Método da Bolha <<<");
        System.out.println("Original: ");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " - " + A[i]);
        }

        bubbleSort(A);

        System.out.println("Depois: ");
        for (int i = 0; i < r; i++) {
            System.out.println((i + 1) + " - " + A[i]);
        }
    }
}
