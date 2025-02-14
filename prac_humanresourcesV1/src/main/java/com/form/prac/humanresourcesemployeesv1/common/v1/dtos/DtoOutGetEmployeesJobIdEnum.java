package com.form.prac.humanresourcesemployeesv1.common.v1.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DtoOutGetEmployeesJobIdEnum {
	
	@JsonProperty("PRESIDENT")PRESIDENT("PRESIDENT"),
	@JsonProperty("VICE_PRESIDENT")VICE_PRESIDENT("VICE_PRESIDENT"),
	@JsonProperty("ASSISTANT")ASSISTANT("ASSISTANT"),
	@JsonProperty("FINANCE_MANAGER")FINANCE_MANAGER("FINANCE_MANAGER"),
	@JsonProperty("ACCOUNTANT")ACCOUNTANT("ACCOUNTANT"),
	@JsonProperty("ACCOUNTING_MANAGER")ACCOUNTING_MANAGER("ACCOUNTING_MANAGER"),
	@JsonProperty("PUBLIC_ACCOUNTANT")PUBLIC_ACCOUNTANT("PUBLIC_ACCOUNTANT"),
	@JsonProperty("SALES_MANAGER")SALES_MANAGER("SALES_MANAGER"),
	@JsonProperty("SALES_REPRESENTATIVE")SALES_REPRESENTATIVE("SALES_REPRESENTATIVE"),
	@JsonProperty("PURCHASING_MANAGER")PURCHASING_MANAGER("PURCHASING_MANAGER"),
	@JsonProperty("PURCHASING_CLERK")PURCHASING_CLERK("PURCHASING_CLERK"),
	@JsonProperty("STOCK_MANAGER")STOCK_MANAGER("STOCK_MANAGER"),
	@JsonProperty("STOCK_CLERK")STOCK_CLERK("STOCK_CLERK"),
	@JsonProperty("SHIPPING_CLERK")SHIPPING_CLERK("SHIPPING_CLERK"),
	@JsonProperty("PROGRAMMER")PROGRAMMER("PROGRAMMER"),
	@JsonProperty("MARKETING_MANAGER")MARKETING_MANAGER("MARKETING_MANAGER"),
	@JsonProperty("MARKETING_REPRESENTATIVE")MARKETING_REPRESENTATIVE("MARKETING_REPRESENTATIVE"),
	@JsonProperty("HR_REPRESENTATIVE")HR_REPRESENTATIVE("HR_REPRESENTATIVE"),
	@JsonProperty("PUBLIC_RELATIONS_REPRESENTATIVE")PUBLIC_RELATIONS_REPRESENTATIVE("PUBLIC_RELATIONS_REPRESENTATIVE");
	
	  private String code;

	  private DtoOutGetEmployeesJobIdEnum(final String code) {
	    this.code = code;
	  }

	  public static DtoOutGetEmployeesJobIdEnum getDtoInCreateEmployeesJobIdEnum(final String code) {
	    for(DtoOutGetEmployeesJobIdEnum item : DtoOutGetEmployeesJobIdEnum.values()) {
	      if(item.getCode().equals(code)) return item;
	    }
	    return null;
	  }

	  public String getCode() {
	    return this.code;
	  }
}
