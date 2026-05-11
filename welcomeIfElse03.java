
//In this challenge, we test your knowledge of using if-else conditional 
// statements to automate decision-making processes. An if-else statement has the 
// following logical flow:

/* Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: 
 and  is even, so it isn't weird. Thus, we print Not Weird.

*/

import java.io.*; 
import java.math.*;
import java.security.*; // usado para classes de segurança 
import java.text.*; //para formatação de texto/datas
import java.util.*; //para utilitário como scanner,list e etc
import java.util.concurrent.*; // para programação concorrente (threads)
import java.util.regex.*; //para expressões regulares

// quero saber se o número N é Weird(esquisito) ou não Not Weird, conforme as regras 

public class welcomeIfElse03 {

    private static final Scanner scanner = new Scanner(System.in); //cria um scanner global para ler da entrada padrão(system.in), limita o acesso (private), permite o uso de instâncias( static) e impede alteração (final)  


    public static void main(String[] args) {
        int N = scanner.nextInt(); // lê o próximo inteiro da entrada e armazena em n
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // pula caracteres de quebra de linha após o int e evita problemas ao utilizar nextLina()

        if (N % 2 != 0) { // A primeira coisa é verificar se o N é par ou impar, o % é operador de módulo. Se impar imprime Weird. Os números impares sempre serão Weirds
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) { // se for par verifica se está entre 2 e 5, se sim imprime Not Weird
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) { // senão verifica se está entre 6 e 20 Se sim Imprime Weird
            System.out.println("Weird");
        } else { // senão se par e maior que 20 imprime not weird 
            System.out.println("Not Weird");
        }

        scanner.close(); // fecha o scanner


    }


    
}

//&& é um operador lógico AND (ambas condições devem ser verdadeiras
// != Significa diferente de ou não é igual 
// else if é executado apenas se o anterior for falso
// O else final cobre o último caso
// 5,7,9,11, e etc são ímpares e são identificados no primeiro if