package poo;

public class Coche {
	private int llantas,largo,ancho,motor,pesoPlataforma,pesoTotal;
	private boolean asientosCuero,climatizador;
	private String color;
	public Coche() {
		llantas=4;
		largo=2000;
		ancho=1600;
		pesoPlataforma=500;
	}
	public String dimeLlantas() {
		return "Este coche tiene "+ llantas + " Llantas";
	}
	public String dimeLargo() {
		
		return "El largo del coche es " + largo;
	}
	public void estableceColor(String colorCoche) {
		
		color=colorCoche;
	}
	public String dimeColor() {
		return "El color del coche es "+ color;
	}
	public String dimeGenerales() {
		return "La plataforma del vehiculo tiene" + llantas + " ruedas " + " mide "+ largo/1000 + "metros con un ancho de " +ancho + "cm y un peso de plataforma de " + pesoPlataforma + "kg";
	
				
	}
}
