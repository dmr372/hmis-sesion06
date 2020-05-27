package ual.hmis.sesion07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@ParameterizedTest
	@CsvSource({"Johnny,Joestar27,true",
				"Johnny,Joestar2,false",
				"Johnny,j,false",
				"Johnny,27,false",
				"Johnny,J,false",
				"Johnny,Jj,false",
				"Johnny,J27,false",
				"Johnny,j27,false",
				"Johnny,,false",
			 	",,false",
			 	"Gyro,Zeppelli14,false",
			 	"john,joestar,false",
			 	"Johnny,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false",
			 	"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,Joestar27,false",
			 	"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa,false"})
	void testUsuario(String user, String password, boolean expected) {
		if(user == null) user = "";
		if(password == null) password = "";
		Ejercicio2 c = new Ejercicio2();
		assertEquals(expected, c.login(user, password));
	}

}
