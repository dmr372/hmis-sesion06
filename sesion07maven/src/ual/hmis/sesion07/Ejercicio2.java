package ual.hmis.sesion07;

public class Ejercicio2 {
	
	public boolean login(String user, String password) {
		if(user.isEmpty() || password.isEmpty()) {
			return false;
		}
		
		if(user.length() > 30 || password.length() > 30) {
			return false;
		}
		
		boolean mayuscula = false;
		boolean minuscula = false;
		boolean digito = false;
		
		for(int i = 0; i < password.length();i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				mayuscula = true;
			}
			if(Character.isLowerCase(password.charAt(i))) {
				minuscula = true;
			}
			if(Character.isDigit(password.charAt(i))) {
				digito = true;
			}
		}
		
		if(!(mayuscula && minuscula && digito)) {
			return false;
		}
		
		return compruebaLoginEnBD(user, password);
	}

	public boolean compruebaLoginEnBD(String user, String password) {
		if(user.equals("Johnny") && password.equals("Joestar27")) {
			return true;
		}
		return false;
	}
}

