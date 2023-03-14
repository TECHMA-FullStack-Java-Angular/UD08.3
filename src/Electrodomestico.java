/*Crearemos una clase llamada Electrodomestico con las siguientes caracteristicas:
 * - Sus atributos son precio base, color, consumo energetico (letras entre A y F) y peso.
 * Indica que se podrán heredar.
 * - Por defecto, el color sera blanco, el consumo energetico sera F, el precioBase es de 100€ 
 * y el peso de 5kg. Usa constantes para ello.
 * - Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta 
 * en mayusculas o minusculas.
 * - Los constructores que se implementaran seran:
 * 		- Un constructor por defecto.
 * 		- Un constructor con el precio y peso. El resto por defecto.
 * 		- Un constructor con todos los atributos.*/

public class Electrodomestico {

	// Atributos base con modificador protected para poder heredar
	protected double precioBase;
	protected Color color;
	protected char consumoEnergetico;
	protected double peso;

	protected static final double PRECIO_BASE = 100;
	protected static final Color COLOR = Color.BLANCO;
	protected static final char CONSUMO_ENERGETICO = 'F';
	protected static final double PESO = 5;

	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = PESO;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO_ENERGETICO;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, Color color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = Color.valueOf(color.toString().toUpperCase());
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {

		String opcion = Character.toString(consumoEnergetico).toUpperCase();
		switch (opcion) {
		case "A":
			this.consumoEnergetico = 'A';
			break;
		case "B":
			this.consumoEnergetico = 'B';
		case "C":
			this.consumoEnergetico = 'C';
		case "D":
			this.consumoEnergetico = 'D';
		case "E":
			this.consumoEnergetico = 'E';
		case "F":
			this.consumoEnergetico = 'F';
		default:
			System.out.println("El caracter introducido no es correcto.");
		}

	}

}
