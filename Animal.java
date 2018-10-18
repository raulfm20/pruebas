//definicion de la clase animal
public class Animal{
	//definicion de los atributos
	private String nombre;
	private int edad;

	//definicion de los metodos
	public void nace (){
		System.out.println("Hola, he nacido. ");
		}
		public String getNombre(){
			return nombre;
		}
		public int getEdad(){
			return edad;
		}
		public void setNombre(String nombre){
			this.nombre = nombre;
		}
	public void setEdad(int edad){
		this.edad = edad;
	}
}
