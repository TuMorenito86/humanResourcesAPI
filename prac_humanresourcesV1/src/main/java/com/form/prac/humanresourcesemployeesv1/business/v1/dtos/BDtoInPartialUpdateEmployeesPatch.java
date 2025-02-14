package com.form.prac.humanresourcesemployeesv1.business.v1.dtos;

import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoInPartialUpdateEmployeesDepartmentIdEnum;

public class BDtoInPartialUpdateEmployeesPatch {

	private String nombre;
	private String telefono;
	private Double salario;
	private Double comision;
	private Long managerId;
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
}
