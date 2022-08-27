/* 3) Imprima a soma de 1 até 100. */

public class Ex3 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;
        while (i <= 100){
            soma = soma + i;
            i++;
        }
        System.out.println("Soma dos números de 1 até 100: " + soma);
    }
}

//public class Ex3{
//    public static void main(String[] args) {
//        soma = 0;
//        for (int i = 1; i<=100; i++){
//            soma = soma + i;
//        }
//        System.out.println(soma);
//    }
//}
