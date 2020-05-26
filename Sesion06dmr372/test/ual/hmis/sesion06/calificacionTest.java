package ual.hmis.sesion06;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ejercicio5.Alumno;

	public class calificacionTest {
	@ParameterizedTest
	@CsvSource({"4", "5", "8", "-3", "9.5", "10"})
	
	void notaTest(double nota) {
		Alumno al = new Alumno();
		al.calificacion(nota);
	}

}