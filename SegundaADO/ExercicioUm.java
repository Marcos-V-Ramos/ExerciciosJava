package segundaado;

import java.util.Scanner;


public class ExercicioUm {
    
    public static void main(String[] args){
        Scanner userImput = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = userImput.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = userImput.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double num3 = userImput.nextDouble();
        
        double result = num1 * num2 * num3;
        System.out.println
        ("O resultado é " + result);
        
        userImput.close();
    }
}