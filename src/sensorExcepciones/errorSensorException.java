package sensorExcepciones;

public class errorSensorException extends Exception {

	public errorSensorException(String mensaje) {
		
		// llamamos al constructor de la clase madre: Exception
		super(mensaje);
	}

	public errorSensorException() {
		super("Error en el sensor");
	}
}
