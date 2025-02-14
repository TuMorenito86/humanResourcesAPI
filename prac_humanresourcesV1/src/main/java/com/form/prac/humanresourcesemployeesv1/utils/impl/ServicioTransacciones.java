package com.form.prac.humanresourcesemployeesv1.utils.impl;

import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.form.prac.humanresourcesemployeesv1.utils.IServicioTransacciones;
import com.form.prac.humanresourcesemployeesv1.utils.model.RequestTransaction;

@Component
public class ServicioTransacciones implements IServicioTransacciones {

	private RestTemplate restTemplate;

	/**
	 * realiza la allamada al backend APX
	 * 
	 * @param transactionName
	 * @param requestTransaction
	 * @param responseType
	 * 
	 * @return responseType Class
	 */
	@Override
	public <T> Object invocar(String transactionName,
			RequestTransaction requestTransaction, Class<T> responseType) {
		String[] split = transactionName.split("-");
		ResponseEntity<T> exchange = getRestTemplate().exchange(getUri(),
				HttpMethod.POST, getRequestEntity(requestTransaction, split[0], split[1], split[2]),
				responseType);
		
		return exchange.getBody();
	}

	private URI getUri() {
		return URI.create("http://localhost:8101/APX_Runtime_Online/PGRestService");
	}
	
	private HttpEntity<Object> getRequestEntity(RequestTransaction request,String transactionCode, String version, String country) {
		return new HttpEntity<>(request, getHeaders(transactionCode,version,country));
	}
	
	private RestTemplate getRestTemplate() {
		if(this.restTemplate == null) {
			this.restTemplate = new RestTemplate();
		}
		return this.restTemplate;
	}

	private HttpHeaders getHeaders(String transactionCode, String version, String country) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("logical-transaction-code", transactionCode);
        headers.add("language-code", country)                   ;
        headers.add("country-code", country)            ;
        headers.add("version-code", version)    ;
		headers.add("request-id", "ID-PETICION")                                            ;
		headers.add("client-document", "xe18852")                                           ;
		headers.add("user-code", "xe18852")                                                 ;
		headers.add("operation-date", (new SimpleDateFormat("yyyyMMdd")).format(new Date()));
		headers.add("operation-time", "142600")                                             ;
		headers.add("txClass", "40")                                                        ;
		headers.add("channel-code", "01")                                                   ;
		headers.add("service-id", "1")                                                      ;
		headers.add("environ-code", "01")                                                   ;
		headers.add("authorization-code", "1")                                              ;
		headers.add("authorization-version", "1")                                           ;
		headers.add("branch-code", "0060")                                                  ;
		headers.add("client-identification-type", "6")                                      ;
		headers.add("contact-identifier", "123456780")                                      ;
		headers.add("currency-code", "EUR")                                                 ;
		headers.add("entity-code", "0182")                                                  ;
		headers.add("header-name", "QP06")                                                  ;
		headers.add("ip-address", "127.0.0.1")                                              ;
		headers.add("operative-branch-code", "0060")                                        ;
		headers.add("operative-entity-code", "0182")                                        ;
		headers.add("product-code", "0001")                                                 ;
		headers.add("secondary-currency-code", "?")                                         ;
		headers.add("subtype-code", "01")                                                   ;
		headers.add("type-code", "01")                                                      ;
		headers.add("workstation-code", "10")                                               ;
		headers.add("Content-Type", "application/json")                                     ;
		headers.add("origin", "aaa");

		return headers;
	}
}
