package segundaado;

import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);
        
        System.out.print("Digite o seu primeiro nome: ");
        String nome = userImput.next();
        System.out.println("O nome " + nome + " tem " + nome.length() + " letras!");
        
        userImput.close();
    }
}
