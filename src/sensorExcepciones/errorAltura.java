package sensorExcepciones;

public class errorAltura extends errorSensorException {
	
	public errorAltura(String mensaje) {
		super(mensaje);
	}
	public errorAltura () {
		super("NO TIENES LA ALTURA COMPRENDIDA ENTRE 150 Y 190");
	}
	
	

}
