package ual.hmis.sesion06;

import java.util.ArrayList;

public class Ferry {

	private int numMaxPasajeros;
	private int numTotalVehiculos;
	private int pesoMaxVehiculos;
	private int numTotalPasajeros;
	private int pesoTotalVehiculos;
	private int numMaxVehiculos;
	private ArrayList<Vehiculo> vehiculos;
	
	public Ferry() {
		this.numTotalPasajeros = 0;
		this.numTotalVehiculos = 0;
		this.pesoTotalVehiculos = 0;
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
		// Embarca un veh�culo a�adi�ndolo a la lista
		public boolean embarcarVehiculo (Vehiculo v) {
			vehiculos.add(v);
			if (vehiculos.contains(v)) return true;
			return false;
		}
		
		// devuelve el n�mero total de veh�culos embarcados
		public int totalVehiculos() {
			return getNumTotalVehiculos();
		}
		
		// verdadero si no hay ning�n veh�culo
		public boolean vacio() {
			if (vehiculos.isEmpty()) return true;
			return false;
		}
		
		// verdadero si el número total de los vehículos supera el máximo
		public boolean superadoMaximoVehiculos() {
			if (numTotalVehiculos > numMaxVehiculos) return true;
			return false;
		}
		
		// verdadero si el peso total de los veh�culos supera el m�ximo
		public boolean superadoMaximoPeso() {
			if (pesoTotalVehiculos > pesoMaxVehiculos) return true;
			return false;
		}
		
		// -----------------GETTERS Y SETTERS --------------------------
		
		
		public int getNumMaxPasajeros() {
			return numMaxPasajeros;
		}

		public void setNumMaxPasajeros(int numMaxPasajeros) {
			this.numMaxPasajeros = numMaxPasajeros;
		}

		public int getNumTotalVehiculos() {
			return numTotalVehiculos;
		}

		public void setNumTotalVehiculos(int numTotalVehiculos) {
			this.numTotalVehiculos = numTotalVehiculos;
		}

		public int getPesoMaxVehiculos() {
			return pesoMaxVehiculos;
		}

		public void setPesoMaxVehiculos(int pesoMaxVehiculos) {
			this.pesoMaxVehiculos = pesoMaxVehiculos;
		}

		public int getNumTotalPasajeros() {
			return numTotalPasajeros;
		}

		public void setNumTotalPasajeros(int numTotalPasajeros) {
			this.numTotalPasajeros = numTotalPasajeros;
		}

		public int getPesoTotalVehiculos() {
			return pesoTotalVehiculos;
		}

		public void setPesoTotalVehiculos(int pesoTotalVehiculos) {
			this.pesoTotalVehiculos = pesoTotalVehiculos;
		}

		public ArrayList<Vehiculo> getVehiculos() {
			return vehiculos;
		}

		public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
			this.vehiculos = vehiculos;
		}

		public int getNumMaxVehiculos() {
			return numMaxVehiculos;
		}

		public void setNumMaxVehiculos(int numMaxVehiculos) {
			this.numMaxVehiculos = numMaxVehiculos;
		}
		
		
		
		
}

