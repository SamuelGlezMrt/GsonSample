package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) {

		Persona p = new Persona();
		Scanner scanner = new Scanner(System.in);

		System.out.println("[Campo obligatorio] Introduce un nombre:");
		p.Nombre = scanner.nextLine();
		
		while (!p.Nombre.matches("^[a-zA-Z]+$")) {
			System.out.println("Este nombre no es correcto, introduzca otro nombre:");
			p.Nombre = scanner.nextLine();
		}
				
		System.out.println("[Campo obligatorio] Introduce los apellidos:");
		p.Apellidos = scanner.nextLine();
		
		while (!p.Apellidos.matches("^[a-zA-Z]+( [a-zA-Z]+)*$")) {
			System.out.println("Los apellidos no son correctos, introduzca otros apellidos");
		 	p.Apellidos = scanner.nextLine();
		}		
		
		System.out.println("[Campo obligatorio] Introduce la edad:");
		p.Edad = scanner.nextInt();

		scanner.close();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
 	
}
