package segundaado;

import java.util.Scanner;

public class ExercicioTres {
    
    public static void main(String[] args) {
        final Scanner userImput = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int inteiroTabuada = userImput.nextInt();
        
        System.out.println(inteiroTabuada);
        System.out.println(inteiroTabuada * 2);
        System.out.println(inteiroTabuada * 3);
        System.out.println(inteiroTabuada * 4);
        System.out.println(inteiroTabuada * 5);
        System.out.println(inteiroTabuada * 6);
        System.out.println(inteiroTabuada * 7);
        System.out.println(inteiroTabuada * 8);
        System.out.println(inteiroTabuada * 9);
        System.out.println(inteiroTabuada * 10);
        
        userImput.close();
    }
}