package com.form.prac.humanresourcesemployeesv1.dao.v1.model.out;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract03701ESTransactionResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3106402896380822502L;
	
	
	@JsonProperty("data")
	Pract03701ESResponse data;

	public Pract03701ESResponse getData() {
		return data;
	}

	public void setData(Pract03701ESResponse data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pract03701ESTransactionResponse other = (Pract03701ESTransactionResponse) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Pract03701ESTransactionResponse [data=" + data + "]";
	}
	
	

}

