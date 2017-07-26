package com.icinfo.frk.business.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "frk.ca_code_industrytype")
public class CaCodeIndustrytype implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "id")
	private Integer id;

	@Column(name = "code")
	private String code;
	
	@Column(name = "content")
	private String content;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
