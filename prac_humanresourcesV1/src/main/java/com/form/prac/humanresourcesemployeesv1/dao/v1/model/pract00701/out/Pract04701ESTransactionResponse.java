package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pract00701.out;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract04701ESTransactionResponse {

	@JsonProperty("data")
	Pract04701ESResponse data;

	public Pract04701ESTransactionResponse(Pract04701ESResponse data) {
		super();
		this.data = data;
	}

	public Pract04701ESTransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pract04701ESResponse getData() {
		return data;
	}

	public void setData(Pract04701ESResponse data) {
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
		Pract04701ESTransactionResponse other = (Pract04701ESTransactionResponse) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Pract04701ESTransactionResponse [data=" + data + "]";
	}
	
	
}
