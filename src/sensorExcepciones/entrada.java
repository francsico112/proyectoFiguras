package sensorExcepciones;

public class entrada {

	public static void main(String[] args) throws errorAltura {
		
		sensor x=new sensor();
		
		
		try {
			System.out.println("entrando con la siguiente altura" + x.obtenerAltura(-1));
		} catch (errorSensorException e) {
			System.out.println(e.getMessage());
		}

	}

}
