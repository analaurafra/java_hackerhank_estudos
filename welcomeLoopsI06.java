/*Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, .

Constraints

Output Format

Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20 */


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// Uso de Loops para gerar uma tabuada 

public class welcomeLoopsI06 {

    /* - Números inteiros, Número naturais multiplicados por 10.
       -  N x i, onde (1 <= i <= 10)
       -  Restrições (Contraints) = 2 <= N <= 20
       - Printe 10 linhas = N x i = resultado
    */
    
    public static void main(String[] args) throws IOException { // ponto de entrada padrão, IOException indica que o método pode lançar uma exceção de entrada e saída durante a leitura
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim()); // Cria o objeto BufferedRead que vai ler os dados do teclado o comando InputStreamReader(System.in), converte os bytes em caracteres 
        // Lê uma linha de texto de entrada, o .trim() remove espaços em branco no inicio e fim da linha
        // o Integer.perseInt converte a string resultante para número inteiro
        
        // Validação dos constraints: 2 <= N <= 20
        if(N < 2 || N > 20) { // checa se o valor de n é menor que dois OU(||) maior que 20
            System.out.println("Erro: N deve estar entre 2 e 20");
            bufferedReader.close();
            return;
        }

        for(int i = 1; i <= 10; i++){
            // System.out.println(N + " x " + i + " = " + (N * i)); Eu havia feito dessa forma, mas é melhor colocar uma máscara de formatação, conforme abaixo
            System.out.printf("%d x %d = %d%n", N, i, (N * i)); // Usei o printf também



        }

        bufferedReader.close(); // fecha o objeto
        

    }

}


// O BufferedRead ou Scanner são classes padrões do Java para leitura