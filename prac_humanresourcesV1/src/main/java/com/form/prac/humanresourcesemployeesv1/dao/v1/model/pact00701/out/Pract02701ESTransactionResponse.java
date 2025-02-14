package com.form.prac.humanresourcesemployeesv1.dao.v1.model.pact00701.out;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract02701ESTransactionResponse implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5045180429797410507L;
	
	@JsonProperty("data")
	Pract02701ESResponse data;

	public Pract02701ESResponse getData() {
		return data;
	}

	public void setData(Pract02701ESResponse data) {
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
		Pract02701ESTransactionResponse other = (Pract02701ESTransactionResponse) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Pract02701ESTransactionResponse [data=" + data + "]";
	}


}
