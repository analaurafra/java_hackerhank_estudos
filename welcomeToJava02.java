/* Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5
Alternatively, you can use the BufferedReader class.

Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125
*/

// Input Stream as System.in. For example:

import java.util.*;


public class welcomeToJava02 {

        public static void main(String[] args){ // Ponto der entrada do Java, ao executar a classe é iniciado a partir desse ponto

        Scanner scanner = new Scanner(System.in); // Foi criado um objeto de nome Scanner que lê dados do System.in, ou seja da entrada padrão
        String myString = scanner.next(); // Comando que lê a próxima palavra/token(texto separado por espaço, linha ou tab) e guarda na variável myString 
        int mylnt = scanner.nextInt(); //Lê o próximo valor da entrada como inteiro(int) e guardar em myInt, se o próximo dado não for um número válido, será lançada uma exceção.
        scanner.close(); //fecha o objeto Scanner e liberar o fluxo de entrada

        System.out.println("Digite uma palavra ou Texto:" + myString);
        System.out.println("Digite um Número:" + mylnt);    



    }


}
