import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, cont;
	    double soma, media, percentual;
	    
	    System.out.print("Quantas pessoas serao digitadas? ");
	    N = sc.nextInt();
	    
	    String[] nomes = new String[N];
	    int[] idades = new int[N];
	    double[] alturas = new double[N];
	    
	    for (int i = 0; i < N; i++) {
	    	System.out.println("Dados da " + (i + 1) + "a pessoa:");
	    	System.out.print("Nome: ");
	    	sc.nextLine();
	    	nomes[i] = sc.nextLine();
	    	System.out.print("Idade: ");
	    	idades[i] = sc.nextInt();
	    	System.out.print("Altura: ");
	    	alturas[i] = sc.nextDouble();
	    }
	    
	      soma = 0;
	      for (int i = 0; i < N; i++) {
	           soma = soma + alturas[i];
	      }
	      media = soma / N;
	      
	      System.out.println();
	      System.out.println("Altura media: " + String.format("%.2f", media));
		
	      cont = 0;
	      for (int i = 0; i < N; i++) {
	           if (idades[i] < 16) {
	            cont = cont + 1;
	           }
	      }

	      percentual = (double) cont * 100 / N;
	      
	      System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percentual) + "%");
	      
	      for (int i = 0; i < N; i++) {
	            if (idades[i] < 16) {
	            	System.out.println(nomes[i]);
	            }
	      }
	            
	      sc.close();
	      
	        
	}

}
