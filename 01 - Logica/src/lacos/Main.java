package lacos;

public class Main {

	public static void main(String[] args) {
		
		
		// Contador
		int contador = 0;
		
		// La�o - While
		while(contador < 11) {
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("-----------------------");
		// La�o - Do While
		
		contador = 0;
		
		do {
			System.out.println(contador);
			contador++;
			
		}while(contador < 11);
		
		//La�o - For
		for(int i = 0; i<11; i++){
			System.out.println(i);
			
		}
	}
}
