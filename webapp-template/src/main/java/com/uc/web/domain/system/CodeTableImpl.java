package com.uc.web.domain.system;

public class CodeTableImpl implements CodeTable {
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder
		.append("[CodeTableImpl ")
		.append("代码=[").append(getCode()).append("]")
		.append("值=[").append(getValue()).append("]")
		.append("有效=[").append(getValid()?"是":"否").append("]")
		.append("]");
		return builder.toString();
	}
	private String code;

	private Boolean valid;

	private String value;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public Boolean getValid() {
		return valid;
	}

	@Override
	public String getValue() {
		return value;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	@Override
	public void setValue(String value) {
		this.value = value;
	}
	
	public CodeTableImpl(){
		this("", "");
	}
	public CodeTableImpl(String code, String value){
		this(code, value, true);
	}
	public CodeTableImpl(String code, String value, Boolean valid){
		this.code=code;
		this.value=value;
		this.valid=valid;
	}
}
