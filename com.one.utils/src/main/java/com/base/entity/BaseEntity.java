package com.base.entity;
import java.util.Date;

public class BaseEntity extends BaseObject {
	
	private static final long serialVersionUID = 1L;
	
	protected String 	dataId;			//32位GUID
	protected int 		dataEnable;		//数据状态 1:有效 , 0:无效
	protected Date 	dataInsertTime;	//入库时间
	protected Date 	dataUpdateTime;	//修改时间
	protected Date 	dataDeleteTime;	//删除时间
	
	protected String 	extensionA;
	protected String 	extensionB;
	protected String 	extensionC;
	protected String 	extensionD;
	protected String 	extensionE;
	protected String 	extensionF;
	
	public String getDataId() {
		return dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}
	public int getDataEnable() {
		return dataEnable;
	}
	public void setDataEnable(int dataEnable) {
		this.dataEnable = dataEnable;
	}
	public Date getDataInsertTime() {
		return dataInsertTime;
	}
	public void setDataInsertTime(Date dataInsertTime) {
		this.dataInsertTime = dataInsertTime;
	}
	public Date getDataUpdateTime() {
		return dataUpdateTime;
	}
	public void setDataUpdateTime(Date dataUpdateTime) {
		this.dataUpdateTime = dataUpdateTime;
	}
	public Date getDataDeleteTime() {
		return dataDeleteTime;
	}
	public void setDataDeleteTime(Date dataDeleteTime) {
		this.dataDeleteTime = dataDeleteTime;
	}
	public String getExtensionA() {
		return extensionA;
	}
	public void setExtensionA(String extensionA) {
		this.extensionA = extensionA;
	}
	public String getExtensionB() {
		return extensionB;
	}
	public void setExtensionB(String extensionB) {
		this.extensionB = extensionB;
	}
	public String getExtensionC() {
		return extensionC;
	}
	public void setExtensionC(String extensionC) {
		this.extensionC = extensionC;
	}
	public String getExtensionD() {
		return extensionD;
	}
	public void setExtensionD(String extensionD) {
		this.extensionD = extensionD;
	}
	public String getExtensionE() {
		return extensionE;
	}
	public void setExtensionE(String extensionE) {
		this.extensionE = extensionE;
	}
	public String getExtensionF() {
		return extensionF;
	}
	public void setExtensionF(String extensionF) {
		this.extensionF = extensionF;
	}
	
}