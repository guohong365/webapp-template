package com.uc.web.domain.system;

public class FunctionBase implements Function {
	private String funcId;
	private String funcName;
	private String funcUri;
	private String funcDesc;
	private boolean enableFlag;
	private String funcUriPattern;

	@Override
	public String getId() {
		return funcId;
	}

	@Override
	public void setId(String funcId) {
		this.funcId = funcId;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[FunctionBase")
		.append("[ID=").append(getId()).append("]")
		.append("[功能名称=").append(getName()).append("]")
		.append("[URI=").append(getUri()).append("]")
		.append("[URI路径=").append(getUriPattern()).append("]")
		.append("[描述=").append(getDescription()).append("]")
		.append("[有效=").append(isValid()?"是":"否").append("]")
		.append("]");
		return builder.toString();
	}

	@Override
	public String getName() {
		return funcName;
	}


	@Override
	public void setName(String funcName) {
		this.funcName = funcName;
	}


	@Override
	public String getUri() {
		return funcUri;
	}

	@Override
	public void setUri(String funcUri) {
		this.funcUri = funcUri;
	}


	@Override
	public String getDescription() {
		return funcDesc;
	}


	@Override
	public void setDescription(String funcDesc) {
		this.funcDesc = funcDesc;
	}


	@Override
	public boolean isValid() {
		return enableFlag;
	}


	@Override
	public void setValid(boolean enableFlag) {
		this.enableFlag = enableFlag;
	}


	@Override
	public String getUriPattern() {
		return funcUriPattern;
	}


	@Override
	public void setUriPattern(String funcUriPattern) {
		this.funcUriPattern = funcUriPattern;
	}
}