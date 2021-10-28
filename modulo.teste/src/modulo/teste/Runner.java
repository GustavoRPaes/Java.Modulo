package modulo.teste;

import modulo.teste.dois.interno.Calculadora;

public class Runner {

    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        int a; int b;
        System.out.println(calculadora.multi(a= 6, b= 5));
        System.out.println(calculadora.sum(a= 7, b= 5));
        System.out.println(calculadora.sub(a= 8, b= 5));
        System.out.println(calculadora.div(a= 9, b= 3));
    }
   
}
