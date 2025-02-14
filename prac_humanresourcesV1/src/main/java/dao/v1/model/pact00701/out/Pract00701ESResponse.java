package dao.v1.model.pact00701.out;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract00701ESResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5880229918623222119L;
	@NonNull
	@JsonProperty("createEmpleadoResponse")
	private Empleado empleado;

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pract00701ESResponse other = (Pract00701ESResponse) obj;
		return Objects.equals(empleado, other.empleado);
	}

	@Override
	public String toString() {
		return "Pract00701ESResponse [empleado=" + empleado + "]";
	}

}
