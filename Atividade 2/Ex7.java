/* 1) Criar um programa para imprimir todos os múltiplos de 5 entre 1 e 300. */

public class Ex1 {
    public static void main (String[] args) {
    	System.out.println("Múltiplos de 5 de até 300: ");
        for (int i = 1; i <= 300; i++ ){
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
//public class Ex1 {
//    public static void main (String[] args) {
//		  System.out.println("Múltiplos de 5 de até 300: ");
//        for (int i = 5; i <= 300; i += 5 ){
//            System.out.println(i);
//        }
//    }
//}