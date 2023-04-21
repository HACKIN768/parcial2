package parcial2;

import java.util.Scanner;
	
public class main{
public main(String[]args) {
	
Scanner sc = new Scanner(System.in);
System.out.println("ingrese una frase:");
String frase = new String();

char[] arraycaracteres = frase.toCharArray();
	System.out.println("los caracteres de la frase son:");
for (char c : arraycaracteres) {
System.out.println(c);
}
}
}