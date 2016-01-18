package com.base.papper;

import java.io.Serializable;
import java.util.List;

public class PageSet<T> implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int limit = 10;
	private int start = 0;
	private int total = 0;
	private List<T> datas;
	
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<T> getDatas() {
		return datas;
	}
	public void setDatas(List<T> datas) {
		this.datas = datas;
	}
	
}