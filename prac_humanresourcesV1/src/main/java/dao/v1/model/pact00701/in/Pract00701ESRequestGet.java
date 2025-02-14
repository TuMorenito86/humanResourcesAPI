package dao.v1.model.pact00701.in;

import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

public class Pract00701ESRequestGet implements RequestTransaction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6507241770912598739L;
	@NonNull
	@JsonProperty("createEmpleadoRequest")
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
		Pract00701ESRequestGet other = (Pract00701ESRequestGet) obj;
		return Objects.equals(empleado, other.empleado);
	}

	@Override
	public String toString() {
		return "Pract00701ESRequest [empleado=" + empleado + "]";
	}

}
