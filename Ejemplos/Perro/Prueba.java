import java.util.Scanner;

public class Prueba{
	public static void main(String[] args){
		//Conversión Narrowing
		System.out.println("Conversión Narrowing\n");
		float sueldo = 450.5f;
		double totalSueldos = 1000000.5;
		
		sueldo = (float)totalSueldos;
		System.out.println("El sueldo total es: "+totalSueldos);
		System.out.println("El sueldo es: "+sueldo);
		System.out.println("========================================");
		
        // Aliases
		System.out.println("Aliases\n");
	
		Perro miPerro = new Perro();
		Perro perroMajo = new Perro();
		miPerro.setNombre("Laika");
		perroMajo.setNombre("Toby");
		
		System.out.println("Mi perro se llama "+miPerro.getNombre());
		System.out.println("El perro de Majo se llama " + perroMajo.getNombre());
		System.out.println("Antes de la asignación\n");
		
		miPerro = perroMajo;
		
		System.out.println("Después de la asignación\n");
		System.out.println("Mi perro se llama "+miPerro.getNombre());
		System.out.println("El perro de Majo se llama " + perroMajo.getNombre()+"\n");
		
		miPerro.setNombre("LaikaToby");
		
		System.out.println("Después del cambio de nombre\n");
		System.out.println("Mi perro se llama "+miPerro.getNombre());
		System.out.println("El perro de Majo se llama " + perroMajo.getNombre());
		
		perroMajo.setNombre("TobyLaika");
		
		System.out.println("Después del cambio de nombre\n");
		System.out.println("Mi perro se llama "+miPerro.getNombre());
		System.out.println("El perro de Majo se llama " + perroMajo.getNombre());
		
		miPerro = new Perro();
		System.out.println("Mi perro se llama "+miPerro.getNombre());
		System.out.println("========================================");
		
		//Entrada de datos con Scanner
		System.out.println("Entrada de datos con Scanner\n");
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre de su perro");
		String nombrePerro = teclado.nextLine();
		System.out.println("Ingrese edad de su perro");
		int edadPerro = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Ingrese la raza de su perro");
		String razaPerro = teclado.nextLine();
		System.out.println("Ingrese el color de su perro");
		String colorPerro = teclado.nextLine();
		System.out.println("Ingrese el sexo (F/M) de su perro");
		String sexoPerro = teclado.nextLine();

		Perro perroUsuario = new Perro();
		perroUsuario.setNombre(nombrePerro);
		perroUsuario.setEdad(edadPerro);
		perroUsuario.setRaza(razaPerro);
		perroUsuario.setColor(colorPerro);
		boolean sexoPerroBool = true;
		if (sexoPerro.equals("M")){
			sexoPerroBool = false;
		}
		perroUsuario.setSexo(sexoPerroBool);
		System.out.println("Su perro es: \n "+perroUsuario);
	}
}
