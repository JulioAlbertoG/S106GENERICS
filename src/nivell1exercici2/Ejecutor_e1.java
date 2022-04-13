package nivell1exercici2;

public class Ejecutor_e1 {

	/*Enunciat!!!!ª
	 * Crea una classe anomenada Persona amb els atributs nom, cognom i edat. 
	 * Després crea una classe anomenada GenericMethods amb un mètode genèric 
	 * que accepti tres arguments de tipus genèric. Aquest mètode només ha d’imprimir 
	 * per pantalla els arguments que ha rebut. Al main() de la classe principal, crida 
	 * el mètode genèric amb diferents tipus de paràmetres. Exemple: un objecte de la 
	 * classe Persona, un String i un tipus primitiu. D’aquesta manera has comprovat que 
	 * se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.
	 */
	public static void main(String[] args) {
		

		Persona persona1= new Persona("Daniel","López",13);
		
		GenericMethods.genericMethod(persona1, 'h', 4.89);
	}

}
