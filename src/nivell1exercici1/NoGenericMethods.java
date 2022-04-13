package nivell1exercici1;

public class NoGenericMethods {

	private int nombre;
	private String element1;
	private String element2;
	private String element3;
	
	public static void main(String[] args) {
		/*
		 * Los argumentos, si son de distinto tipo, deben seguir el orden del constructor, sino, me marca error
		 * a la hora de compilar. Eclipse detecta el error solo.
		 */
		NoGenericMethods primero = new NoGenericMethods(3,"taules", "cadires", "alumnes");
		NoGenericMethods segundo= new NoGenericMethods(4,"ordinadors", "cadires", "pissarres");
		NoGenericMethods tercero= new NoGenericMethods(5,"pissarra", "paperera","llibres");
		
		System.out.println("Aula: " + primero.getNombre() + " té " + primero.getElement1() + ", " + primero.getElement2() + ", " + primero.getElement3() + ".");
		System.out.println("Aula: " + segundo.getNombre() + " té " + segundo.getElement1() + ", " + segundo.getElement2() + ", " + segundo.getElement3() + ".");
		System.out.println("Aula: " + tercero.getNombre() + " té " + tercero.getElement1() + ", " + tercero.getElement2() + ", " + tercero.getElement3() + ".");
	}
		
		

		public NoGenericMethods(int nombre,String element1,String element2,String element3) {
			this.nombre=nombre;
			this.element1=element1;
			this.element2=element2;
			this.element3=element3;
		}



		public int getNombre() {
			return nombre;
		}



		public void setNombre(int nombre) {
			this.nombre = nombre;
		}



		public String getElement1() {
			return element1;
		}



		public void setElement1(String element1) {
			this.element1 = element1;
		}



		public String getElement2() {
			return element2;
		}



		public void setElement2(String element2) {
			this.element2 = element2;
		}



		public String getElement3() {
			return element3;
		}



		public void setElement3(String element3) {
			this.element3 = element3;
		}
		

		
		
	
}
