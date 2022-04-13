package nivell1exercici2;

public class Persona {
	private String nom;
	private String cognom;
	private int edat;
	
	public Persona(String nom, String cognom, int edat) {
		this.nom=nom;
		this.cognom=cognom;
		this.edat=edat;	
		
	}
	public String toString() {
		return "El meu nom és "+ nom + ", el cognom "+ cognom + " y la meva edat és "+ edat;
	}

}
