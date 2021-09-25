package segundaado;

import java.util.Scanner;

public class ExercicioDois {
    
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int n = userImput.nextInt();
        
        System.out.println(0); // Primeiro multiplo
        System.out.println(n * 1); // Segundo multiplo
        System.out.println(n * 2); // Terceiro múltiplo
        
        userImput.close();
    }
}
