package com.form.prac.humanresourcesemployeesv1.dao.v1.model.in;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empleado implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8938904262501923590L;
	
	//Este es el empleado de Entrada. (IN)
	

	@NonNull
	@JsonProperty("id")
	private Long id;

	@JsonProperty("nombre")
	private String nombre;
	
	@JsonProperty("telefono")
	private String telefono;
	
	@JsonProperty("salario")
	private Double salario;
	
	@JsonProperty("comision")
	private Double comision;
	
	@JsonProperty("managerId")
	private Long managerId;
	
	@JsonProperty("departmentId")
	private String departmentId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getComision() {
		return comision;
	}

	public void setComision(Double comision) {
		this.comision = comision;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comision, departmentId, id, managerId, nombre, salario, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(comision, other.comision) && Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(id, other.id) && Objects.equals(managerId, other.managerId)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(salario, other.salario)
				&& Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", telefono=" + telefono + ", salario=" + salario
				+ ", comision=" + comision + ", managerId=" + managerId + ", departmentId=" + departmentId + "]";
	}
	
	
	

}
