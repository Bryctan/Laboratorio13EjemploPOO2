package ejercicio_flechas;

import javax.swing.JOptionPane;

//Se crea una clase llamada flecha que nos servira de plantilla para nuestros objetos;
public class Flecha {
	//Se declaran los atributos de la clase Flecha
	int longitud;
	String color;
	
	//Se crea el constructor vacio con metodos correspondiente a la construccion de la flecha
	public Flecha() {
		llenarDatos();
		construirFlecha();
	}
	
	//Tambien se puede crear el constructor con argumentos para llenar los atributos de la flecha
	public Flecha (String color, int longitud) {
		this.color = color;
		this.longitud = longitud;
	}
	
	//Se crea un metodo que nos va ayudar crear la fecha
	public void construirFlecha() {
		//Se crea un ciclo el cual va iterar hasta la longitud asignada
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">"+"\n"); // se concatena a lo ultimo un salto de linea para separar cada flecha
	}
	
	//Se crea un metodo que nos va ayudar a imprimir la fecha con su respectivo color que se le asigne 
	//tomando de argumento por cada iteracion del anterior ciclo
	public void imprime(String simbolo) {
		if(color.equalsIgnoreCase("negro")) {
			System.out.print(simbolo);
		}
		else {
			//Se utiliza el System.err.print() para crear una flecha de color rojo
			System.err.print(simbolo);
		}
	}
	//Se crea un metodo para pedir por un panel emergente los datos que se nesesita la flecha a construir
	public void llenarDatos() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de una flecha"));
		color = JOptionPane.showInputDialog("Ingrese el color de la fecha");
	}

	

}
