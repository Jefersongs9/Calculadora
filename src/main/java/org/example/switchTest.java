package org.example;

import java.util.Scanner;

public class switchTest {
    public static void main() {

        String operacao;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escolha sua operação (somar, subtrair, multiplicar, dividir): ");
        operacao = entrada.nextLine();

        switch( operacao )
        {
            case "somar": FuncaoSoma.somar();

                break;

            case "subtrair": FuncaoSubtrair.subtrair();

                break;

            case "multiplicar": FuncaoMultiplicar.multiplicar();

                break;

            case "dividir": FuncaoDivisao.dividir();

                break;

            default:
                System.out.println(" Por favor, escolha uma das seguintes operações: somar, subtrair, multiplicar, dividir");


        }

    }
}