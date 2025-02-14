package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract01701.out;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Empleado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6741821029022859925L;
	@NonNull
	@JsonProperty("id")
	private Long id;
	@JsonProperty("nombre")
	private String nombre;
	@NonNull
	@JsonProperty("apellido")
	private String apellido;
	@NonNull
	@JsonProperty("email")
	private String email;
	@JsonProperty("telefono")
	private String telefono;
	@NonNull
	@JsonProperty("fechaAlta")
	private Date fechaAlta;
	@NonNull
	@JsonProperty("jobId")
	private String jobId;
	@JsonProperty("salario")
	private Double salario;
	@JsonProperty("comision")
	private Double comision;
	@JsonProperty("managerId")
	private Long managerId;
	@JsonProperty("departmentId")
	private String departmentId;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the fechaAlta
	 */
	public Date getFechaAlta() {
		return fechaAlta;
	}
	/**
	 * @param fechaAlta the fechaAlta to set
	 */
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}
	/**
	 * @param jobId the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	/**
	 * @return the salario
	 */
	public Double getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	/**
	 * @return the comision
	 */
	public Double getComision() {
		return comision;
	}
	/**
	 * @param comision the comision to set
	 */
	public void setComision(Double comision) {
		this.comision = comision;
	}
	/**
	 * @return the managerId
	 */
	public Long getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}
	/**
	 * @return the departmentId
	 */
	public String getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the serialversionuid
	 */
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
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(comision, other.comision)
				&& Objects.equals(departmentId, other.departmentId) && Objects.equals(email, other.email)
				&& Objects.equals(fechaAlta, other.fechaAlta) && Objects.equals(id, other.id)
				&& Objects.equals(jobId, other.jobId) && Objects.equals(managerId, other.managerId)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(salario, other.salario)
				&& Objects.equals(telefono, other.telefono);
	}	
}
