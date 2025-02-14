package com.form.prac.humanresourcesemployeesv1.common.v1.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DtoInListEmployeesDepartmentIdEnum {
	
	@JsonProperty("ADMINISTRATION")ADMINISTRATION("ADMINISTRATION"),
	@JsonProperty("MARKETING")MARKETING("MARKETING"),
	@JsonProperty("PURCHASING")PURCHASING("PURCHASING"),
	@JsonProperty("HUMAN_RESOURCES")HUMAN_RESOURCES("HUMAN_RESOURCES"),
	@JsonProperty("SHIPPING")SHIPPING("SHIPPING"),
	@JsonProperty("IT")IT("IT"),
	@JsonProperty("PUBLIC_RELATIONS")PUBLIC_RELATIONS("PUBLIC_RELATIONS"),
	@JsonProperty("SALES")SALES("SALES"),
	@JsonProperty("EXECUTIVE")EXECUTIVE("EXECUTIVE"),
	@JsonProperty("FINANCE")FINANCE("FINANCE"),
	@JsonProperty("ACCOUNTING")ACCOUNTING("ACCOUNTING"),
	@JsonProperty("TREASURY")TREASURY("TREASURY"),
	@JsonProperty("CORPORATE_TAX")CORPORATE_TAX("CORPORATE_TAX"),
	@JsonProperty("CONTROL_AND_CREDIT")CONTROL_AND_CREDIT("CONTROL_AND_CREDIT"),
	@JsonProperty("SHAREHOLDER_SERVICES")SHAREHOLDER_SERVICES("SHAREHOLDER_SERVICES"),
	@JsonProperty("BENEFITS")BENEFITS("BENEFITS"),
	@JsonProperty("MANUFACTURING")MANUFACTURING("MANUFACTURING"),
	@JsonProperty("CONSTRUCTION")CONSTRUCTION("CONSTRUCTION"),
	@JsonProperty("CONTRACTING")CONTRACTING("CONTRACTING"),
	@JsonProperty("OPERATIONS")OPERATIONS("OPERATIONS"),
	@JsonProperty("IT_SUPPORT")IT_SUPPORT("IT_SUPPORT"),
	@JsonProperty("NOC")NOC("NOC"),
	@JsonProperty("IT_HELPDESK")IT_HELPDESK("IT_HELPDESK"),
	@JsonProperty("GOVERNMENT_SALES")GOVERNMENT_SALES("GOVERNMENT_SALES"),
	@JsonProperty("RETAIL_SALES")RETAIL_SALES("RETAIL_SALES"),
	@JsonProperty("RECRUITING")RECRUITING("RECRUITING"),
	@JsonProperty("PAYROLL")PAYROLL("PAYROLL");
	
	  private String code;

	  private DtoInListEmployeesDepartmentIdEnum(final String code) {
	    this.code = code;
	  }

	  public static DtoInListEmployeesDepartmentIdEnum getDtoInCreateEmployeesJobIdEnum(final String code) {
	    for(DtoInListEmployeesDepartmentIdEnum item : DtoInListEmployeesDepartmentIdEnum.values()) {
	      if(item.getCode().equals(code)) return item;
	    }
	    return null;
	  }

	  public String getCode() {
	    return this.code;
	  }
}
