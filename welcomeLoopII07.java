/* We use the integers , , and  to create the following series:

(a+2°.6), (a+2°.b+6^1.b),...,(a+2°.b+2^1.b+...+2^n-1.b)

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

- 0<=q<=500
- 0<=a,b<=50
- 1<=n<=15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values. */


import java.util.*;
import java.util.Scanner.*;
import java.io.*;

// utilizaremos filas


class welcomeLoopII07 {

    public static void main(String[] args){ // entrada padrão 
        Scanner scanner = new Scanner(System.in); // gera um objeto chamado scanner
            if (scanner.hasNextInt()){ // verifica se o scanner possui um próximo numero inteiro disponível, evitando erros de leitura
                int numero = scanner.nextInt(); // le o primeiro numero e guarda em numero (a variavel numero representa a Qtdade de testes serão executados)

                for(int i = 0; i < numero ; i++ ){ // esse loop repete o vido numero vezes
                    int a = scanner.nextInt(); // é lido 3 inteiros para cada teste
                    int b = scanner.nextInt();
                    int n = scanner.nextInt();

                int soma = a; // inicializa a soma com a variável a
                
                for (int j = 0; j < n; j++){ //Novo loop intero que gera n termos da sequencia
                
                soma += (Math.pow(2, j) * b); // calcula 2^j * b e adiciona à soma, cada interação cresce em potência de 2
                System.out.print(soma + " "); // imprime o valor atual da soma seguido de um espaço

                }
                
                System.out.println(); //depois de imprimir os ns termos, quebra a minha
            }
        }
        
        scanner.close(); // fechamento do objeto
    } 
} 


/*
primeiro termo: a + 2^0 * b
segundo termo: a + 2^0 * b + 2^1 * b
terceiro termo: a + 2^0 * b + 2^1 * b + 2^2 * b
e assim por diante, até n termos


*/