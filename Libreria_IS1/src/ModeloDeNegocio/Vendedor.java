package ModeloDeNegocio;
import java.util.*;

public class Vendedor {

		private String dni;
		private String nombre;
		private String apellidos;
		private long telefono;
		private String email;
		private List<Bono> listaBonos;
		
		public Vendedor(String dni, String nombre, String apellidos, long telefono, String email) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.email = email;
			this.listaBonos = new ArrayList<Bono>();
		}
		
		
		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public String getApellidos() {
			return apellidos;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		public long getTelefono() {
			return telefono;
		}


		public void setTelefono(long telefono) {
			this.telefono = telefono;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public List<Bono> getListaBonos() {
			return listaBonos;
		}


		public void setListaBonos(List<Bono> listaBonos) {
			this.listaBonos = listaBonos;
		}


		public void modificar (String dni, String nombre, String apellidos, long telefono, String email) {
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.telefono = telefono;
			this.email = email;
		}
		
		public boolean anadirBono(Bono bono) {
			return this.listaBonos.add(bono);
		}
	
}
