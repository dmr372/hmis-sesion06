package ual.hmis.sesion06;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class FerryTest {

	@ParameterizedTest
	@CsvSource({"1200, 4, 4", 
			 	"2000, 5, 4",})
	void testFerry(int peso, int numRuedas, int numPasajeros) {
		
		Vehiculo v1 = new Vehiculo();
		Vehiculo v2 = new Vehiculo();
		Vehiculo v3 = new Vehiculo();
		
		v1.setPeso(500);
		v2.setPeso(800);
		v3.setPeso(1050);
		
		Ferry f = new Ferry();
		
		assertTrue(f.vacio());
		
		f.embarcarVehiculo(v1);
		f.embarcarVehiculo(v2);
		f.embarcarVehiculo(v1);
		
		assertTrue(f.vacio()==false);
		 
		assertTrue(f.totalVehiculos()==2);
		f.setNumMaxVehiculos(2);
		f.embarcarVehiculo(v3);
		assertTrue(f.superadoMaximoVehiculos());
		f.setPesoMaxVehiculos(1400);
		assertTrue(f.superadoMaximoPeso());
		
		
	}

}
