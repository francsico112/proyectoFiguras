package sensorExcepciones;

public class sensor {

	public int obtenerAltura(int altura) throws errorSensorException{   
		if (altura < 0) { 

			throw new errorSensorException();
			
		} else if (altura < 150 || altura > 190)
			throw new errorAltura();

		return altura;
	}

}
