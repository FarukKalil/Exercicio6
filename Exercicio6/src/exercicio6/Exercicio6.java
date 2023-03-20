package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        double n1, n2, soma, subtracao, multiplicacao, divisao;
        int operacao = -1;
        int continuar;
        boolean reiniciar = true;
        while (reiniciar == true){
            Scanner captura = new Scanner(System.in);
            System.out.println("========== Calculadora ===== V2 =====");
            System.out.println("Digite um número: ");
            n1 = captura.nextDouble();
            System.out.println("Digite um número: ");
            n2 = captura.nextDouble();
            while (operacao  <1 || operacao > 4){
                System.out.println("Que operação deseja realizar ? ");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("Digite um número da operação:");
                operacao = captura.nextInt();
                if (operacao == 1){
                    soma = n1 + n2;
                    System.out.println("A soma é: " + soma);
                } if (operacao == 2){
                    subtracao = n1 - n2;
                    System.out.println("A subtração é: " + subtracao);
                } if (operacao == 3){
                    multiplicacao = n1 * n2;
                    System.out.println("A multiplicação é: " + multiplicacao);
                } if (operacao == 4){
                    divisao = n1 / n2;
                    System.out.println("A divisão é: " + divisao);
                }
                System.out.println("Fazer outro calculo?");
                System.out.println("1 - para continuar");
                System.out.println("2 - para sair");
                continuar = captura.nextInt();
                
                if(continuar == 1){
                    operacao = -1;
                    System.out.println("Novo Cálculo!");
                    break;
                }else{
                    reiniciar = false;
                    System.out.println("Você saiu!");
                }
            }
        } 
    }
    
}
