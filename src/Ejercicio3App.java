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

public class Ejercicio3App {

	public static void main(String[] args) {
		
		//Utilizamos los 3 constructores para crear objetos
		Electrodomestico horno = new Electrodomestico();
		Electrodomestico nevera = new Electrodomestico(1000,50);
		Electrodomestico tostadora = new Electrodomestico(35, Color.BLANCO,'A',10);
		
		
		System.out.println("Probando constructor por defecto - Consumo Energetico horno: "+horno.getConsumoEnergetico());
		
		//Alteramos consumo energetico a A
		horno.setConsumoEnergetico('a');
		System.out.println("Probando parametro modificado - Consumo Energetico horno modificado: "+horno.getConsumoEnergetico());
		
		//Alteramos consumo energetico a valor incorrecto
		tostadora.setConsumoEnergetico('g');
		System.out.println("Probando parametro modificado invalido - Consumo Energetico tostadora modificado con valor invalido: "+tostadora.getConsumoEnergetico());
		
		//Probando constructor 2 parametros
		System.out.println("Probando constructor doble parámetro - Color nevera: "+nevera.getColor());
		
		//Probando modificacion de parametro enum en constructor completo
		tostadora.setColor(Color.ROJO);
		System.out.println("Probando parametro modificad - Color tostadora modificado: "+tostadora.getColor());
		
	}

}
