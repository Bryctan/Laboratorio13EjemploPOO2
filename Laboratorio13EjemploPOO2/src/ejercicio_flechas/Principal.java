package ejercicio_flechas;
//Se crea una clase llamada principal para utilizarlo como un modulo de arranque;
public class Principal {
	//Se crea un metodo main para instanciar las fechas que se desean crear
	//y ejecutar nuestro codigo
	public static void main(String[] args) {
		Flecha flecha = new Flecha();
		Flecha flecha1 = new Flecha("rojo", 15);
		flecha1.construirFlecha();
	}

}
