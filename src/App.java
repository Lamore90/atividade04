//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double resultado;
        
        System.out.print("digite a primeira nota:");
        nota1 = teclado.nextDouble();

        System.out.print ("digite a segunda nota:");
        nota2 = teclado.nextDouble();
        
        System.out.print("Digite a terceira nota:");
        nota3 = teclado.nextDouble();

        System.out.print("digite a quarta nota:");
        nota4 = teclado.nextDouble();
        
        teclado.close();


        resultado = (nota1+nota2+nota3+nota4)/4;

        System.out.println("o resultado é:"+resultado);
        


    }
}
