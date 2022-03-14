package exemplo03;

public class Pessoa {

	/**
	 * DEFAULT   : Atributos e m�todos viciveis apenas no mesmo pacote
	 * PUBLIC    : Atributos e metodos visiveis em todo projeto
	 * PRIVATE   : Atributos e m�todos visiveis apenas na classe onde s�o criados 
	 * PROTECTED : Atributos e m�todos vis�veis nas classes onde s�o criados ou herdados
	 */
	String nome;
	public int idade;
	private double peso;
	protected double altura;
	
	// Get e Set
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	

}
