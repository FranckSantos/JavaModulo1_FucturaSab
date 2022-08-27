/*6) Faça um programa que receba peso, altura e sexo de uma pessoa e calcule o IMC. 
Utilizando a fórmula IMC = peso / (altura*altura). Apresente na tela os seus resultados 
de acordo com o sexo da pessoa com base na tabela abaixo:
OBS: IMC é a sigla para Índice de Massa Corpórea, parâmetro adotado pela Organização Mundial de Saúde
 para calcular o peso ideal de cada pessoa. 

Condição (saída)                   Mulher                   Homem

Abaixo do peso                    < 19,1                   < 20,7

No peso normal                  19,1 | 25,8                20,7 | 26,4

Pouco acima do peso             25,8 | 27,3               26,4 | 27,8

Acima do peso ideal             27,3 | 32,3               27,8 | 31,1

Obeso                           > 32,3                       > 31,1     */


import java.util.Locale;

import java.util.Scanner;

public class Ex6 {

        public static void main(String[] args) {
                Locale.setDefault(Locale.US); //configura o eclipse para aceitar números com ponto.
               
                double peso = 0, altura = 0, imc;
                String sexo;
               
                Scanner input = new Scanner(System.in);
               
                System.out.println("Cálculo do IMC");

                System.out.print("Digite o seu sexo: ");
                sexo = input.next();
               
                System.out.print("Digite o seu peso em kilogramas: ");
                peso = input.nextDouble();
               
                System.out.print("Digite a sua altura em metros: ");
                altura = input.nextDouble();
               
                imc = peso / (altura * altura);
               
                System.out.printf("IMC:%.2f%n", imc);
                input.close(); // fechar o Scanner
               
                if(sexo.equalsIgnoreCase("m")) {
                        if (imc < 20.7) {
                                System.out.println("abaixo do peso");
                        } else if (imc < 26.4) {
                                System.out.println("No peso normal");
                        } else if (imc < 27.8) {
                                System.out.println("Pouco acima do peso");
                        } else if (imc < 31.1) {
                                System.out.println("Acima do peso ideal");
                        } else {
                                System.out.println("Obeso");
                        }
                }
                else if(sexo.equalsIgnoreCase("f")) {
                        if (imc < 19.1) {
                                System.out.println("abaixo do peso");
                        } else if (imc < 25.8) {
                                System.out.println("No peso normal");
                        } else if (imc < 27.3) {
                                System.out.println("Pouco acima do peso");
                        } else if (imc < 32.3) {
                                System.out.println("Acima do peso ideal");
                        } else {
                                System.out.println("Obeso");
                        }
                }
        }
}