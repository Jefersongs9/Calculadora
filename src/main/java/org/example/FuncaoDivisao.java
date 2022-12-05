package org.example;

import java.util.Scanner;

public class FuncaoDivisao {

    public static void dividir(){
        Scanner entradausuario = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        Integer numero1 = entradausuario.nextInt();

        System.out.println("Digite o segundo numero");

        Integer numero2 = entradausuario.nextInt();

        Integer resultadoDaSoma = numero1/numero2;

        System.out.println(resultadoDaSoma);

        entradausuario.close();
    } }
