
/*Java's System.out.printf function can be used to print formatted output. 
The purpose of this exercise is to test your understanding of formatting output using printf.
To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly  characters.
The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

Sample Input

java 100
cpp 65
python 50
Sample Output

================================
java           100 
cpp            065 
python         050 
================================
Explanation

Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
public class welcomeOutputFormating05 {
    
}
*/


import java.util.Scanner;

public class welcomeOutputFormating05 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); //cria um scanner para ler dados da entrada padrão
            System.out.println("================================"); //printa uma linha com 32 caracteres que será o separador inicial da tabela 
            
            for(int i=0;i<3;i++){ // isto é um Loop Fo e java, o qual repete um bloco de código em um numero especifico de vezes, executando exatamente 3 vezes, para processar 3 linhas de entrada
                /*- int i=0 --> inicialização, declara uma variável i do tipo inteiro e a inicializa com zero.
                  - i é o contador do loop
                  - i<3 é a condição, onde é verificado se i é menor que 3.
                  se verdadeiro executa o bloco, se falso sai do loop.
                  i++ incrementa de 1 em 1 a cada execução do bloco (i = i + 1)
                */
                String texto = scanner.next();
                int numero = scanner.nextInt();

                System.out.printf("%-15s%03d%n", texto, numero);
                /* - %-15s --> alinhamento à esquerda com exatamente 15 caracteres
                   - %03d --> inteiro com 3 digitos preenchidos com zeros à esquerda
                   exemplo : 100 ( já tem 3 zeros) / 065 (preenchdi com um zero)
                   - %n nova linha (quebra de linha)                
                */
            
           
            }
            
            System.out.println("================================"); //printa a linha de 
            scanner.close();   // separação

    }
}


