//importa el paquete que contiene la clase scanner
import java.util.*;

//definicion de la clase
public class TestAnimal {
//definicion del metodo principal
	public static void main(String[] args){

		//declaracion del objeto Animal
		Animal animal1 = new Animal();

		//declaracion del objeto teclado de la clase Scanner
		Scanner teclado = new Scanner(System.in);
		//pedir el nombre del animal
		System.out.print("Teclee el nombre del animal: ");
		//leer y asignar nombre al objeto animal1
		animal1.setNombre(teclado.nextLine());
		//pedir la linea del animal
		System.out.print("Teclee la edad del animal: ");
		int edad = teclado.nextInt();
		//asignar edad al objeto animal1
		animal1.setEdad(edad);
		//Informar de los datos de animal1
		animal1.nace();
		System.out.println("Mi nomre es " + animal1.getNombre() + " y mi edad es de " + animal1.getEdad() + " años");
	}

}
