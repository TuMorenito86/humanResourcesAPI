package com.form.prac.humanresourcesemployeesv1.facade.v1.dtos;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInPartialUpdateEmployeesDepartmentIdEnum;

public class DtoInPartialUpdateEmployeesPatch implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2841523794782572608L;
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
	private DtoInPartialUpdateEmployeesDepartmentIdEnum departmentId;

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

	public DtoInPartialUpdateEmployeesDepartmentIdEnum getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DtoInPartialUpdateEmployeesDepartmentIdEnum departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comision, departmentId, managerId, nombre, salario, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DtoInPartialUpdateEmployeesPatch other = (DtoInPartialUpdateEmployeesPatch) obj;
		return Objects.equals(comision, other.comision) && Objects.equals(departmentId, other.departmentId)
				&& Objects.equals(managerId, other.managerId) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(salario, other.salario) && Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "DtoInPartialUpdateEmployeesEmployeeIdPatch [nombre=" + nombre + ", telefono=" + telefono + ", salario="
				+ salario + ", comision=" + comision + ", managerId=" + managerId + ", departmentId=" + departmentId
				+ "]";
	}

}
