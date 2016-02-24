package com.base.utils;

import java.util.Map;

public class CapitalVO {
	
	private String name;//描述名称
	private double invest;//金额
	private double yearRate;//年化率
	private int totalmonth;//月数
	private double totalInterest;//总利息
	private Map<Integer,Double> monthCapital;//每月本金
	private Map<Integer,Double> monthInterest;//每月利息
	private Map<Integer,Double> monthCapitalAndInterest;//每月本息
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getInvest() {
		return invest;
	}
	public void setInvest(double invest) {
		this.invest = invest;
	}
	public double getYearRate() {
		return yearRate;
	}
	public void setYearRate(double yearRate) {
		this.yearRate = yearRate;
	}
	public int getTotalmonth() {
		return totalmonth;
	}
	public void setTotalmonth(int totalmonth) {
		this.totalmonth = totalmonth;
	}
	public Map<Integer, Double> getMonthCapital() {
		return monthCapital;
	}
	public void setMonthCapital(Map<Integer, Double> monthCapital) {
		this.monthCapital = monthCapital;
	}
	public Map<Integer, Double> getMonthInterest() {
		return monthInterest;
	}
	public void setMonthInterest(Map<Integer, Double> monthInterest) {
		this.monthInterest = monthInterest;
	}
	public Map<Integer, Double> getMonthCapitalAndInterest() {
		return monthCapitalAndInterest;
	}
	public void setMonthCapitalAndInterest(Map<Integer, Double> monthCapitalAndInterest) {
		this.monthCapitalAndInterest = monthCapitalAndInterest;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
}