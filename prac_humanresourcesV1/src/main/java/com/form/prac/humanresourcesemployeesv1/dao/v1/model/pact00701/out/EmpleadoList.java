package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.out;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutListEmployeesDepartmentIdEnum;
import com.form.prac.humanresourcesemployeesv1.common.v1.dtos.DtoOutListEmployeesJobIdEnum;

@Validated
public class EmpleadoList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2115093672240522159L;
	

	@NonNull
	@JsonProperty("id")
	private Long id;
	
	@NonNull
	@JsonProperty("nombre")
	private String nombre;
	
	@NonNull
	@JsonProperty("apellido")
	private String apellido;
	
	@NonNull
	@JsonProperty("email")
	private String email;
	
	@NonNull
	@JsonProperty("telefono")
	private String telefono;
	
	@NonNull
	@JsonProperty("fechaAlta")
	private Date fechaAlta;
	
	@NonNull
	@JsonProperty("jobId")
	private DtoOutListEmployeesJobIdEnum jobId;
	
	@NonNull
	@JsonProperty("salario")
	private Double salario;
	
	@NonNull
	@JsonProperty("comision")
	private Double comision;
	
	@NonNull
	@JsonProperty("managerId")
	private Long managerId;
	
	@NonNull
	@JsonProperty("departmentId")
	private DtoOutListEmployeesDepartmentIdEnum departmentId;

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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public DtoOutListEmployeesJobIdEnum getJobId() {
		return jobId;
	}

	public void setJobId(DtoOutListEmployeesJobIdEnum jobId) {
		this.jobId = jobId;
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

	public DtoOutListEmployeesDepartmentIdEnum getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(DtoOutListEmployeesDepartmentIdEnum departmentId) {
		this.departmentId = departmentId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido, comision, departmentId, email, fechaAlta, id, jobId, managerId, nombre, salario,
				telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpleadoList other = (EmpleadoList) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(comision, other.comision)
				&& departmentId == other.departmentId && Objects.equals(email, other.email)
				&& Objects.equals(fechaAlta, other.fechaAlta) && Objects.equals(id, other.id) && jobId == other.jobId
				&& Objects.equals(managerId, other.managerId) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(salario, other.salario) && Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "EmpleadoList [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + ", fechaAlta=" + fechaAlta + ", jobId=" + jobId + ", salario=" + salario
				+ ", comision=" + comision + ", managerId=" + managerId + ", departmentId=" + departmentId + "]";
	}
	
	

}

