package br.edu.unisep.ex04_lista04;

import java.util.Scanner;

public class ProdutoApp {


    public static void main(String[] args) {
        double res = 0;
        for(int i=1; i<11; i++) {
            double oi = obterDados();
            res = res + oi;
        }
        System.out.println(res);
    }


    private static double obterDados(){
        Scanner sc = new Scanner(System.in);

        double sum = 0;


            Produto produto = new Produto();

            System.out.println("Informe o nome do produto: ");
            var nome = sc.nextLine();

            System.out.println("Informe o valor do produto no 1 mercado: ");
            double valor1 = sc.nextDouble();

            System.out.println("Informe o valor do produto no 2 mercado: ");
            double valor2 = sc.nextDouble();

            System.out.println("Informe o valor do produto no 3 mercado: ");
            double valor3 = sc.nextDouble();

            var res = produto.CompararValor(valor1, valor2, valor3);
            sum = sum + res;

        return sum;
    }


}
