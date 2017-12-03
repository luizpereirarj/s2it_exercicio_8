package s2it.exercicio8;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	Numero numero=new Numero();
    	
        System.out.println("Digite o primeiro número: ");
        numero.setPrimeiro(scanner.nextLine().toCharArray());
        System.out.println("Digite o segundo número: ");
        numero.setSegundo(scanner.nextLine().toCharArray());
        
        scanner.close();
        
        Long resultado=numero.aplicaRegras();
        if (resultado!=null) {
        	System.out.println("Resultado:"+resultado);      
        }
        
    }
    
    
}
