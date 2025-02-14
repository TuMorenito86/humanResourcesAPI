package dao.v1.model.pact00701.out;

import java.io.Serializable;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pract00701ESTransactionResponseGet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7367106003085439500L;
	@JsonProperty("data")
	Pract00701ESResponse data;

	public Pract00701ESResponse getData() {
		return data;
	}

	public void setData(Pract00701ESResponse data) {
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
		Pract00701ESTransactionResponseGet other = (Pract00701ESTransactionResponseGet) obj;
		return Objects.equals(data, other.data);
	}

	@Override
	public String toString() {
		return "Pract00701ESTransactionResponse [data=" + data + "]";
	}

}
