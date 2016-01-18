package com.base.entity;

public class BaseSimpleEntity extends BaseObject {

	private static final long serialVersionUID = 1L;
	
	protected String dataId;			//32位GUID

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	
}