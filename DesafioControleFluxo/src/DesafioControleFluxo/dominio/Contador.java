package DesafioControleFluxo.dominio;

import DesafioControleFluxo.Exception.ParametrosInvalidosException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm =teclado.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois =teclado.nextInt();
        try {
            contar(parametroUm,parametroDois);
        }catch (ParametrosInvalidosException e){
            e.printStackTrace();
        }
    }

    public static void contar(int parametroUm,int parametroDois)throws ParametrosInvalidosException {
        if(parametroUm>parametroDois || parametroUm==parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        int contagem=parametroDois-parametroUm;
        for (int i = 0; i < contagem; i++) {
            int a=i+1;
            System.out.println("Imprimindo o número "+ a);
        }
    }
}
