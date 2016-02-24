package com.base.utils;

import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 到期一次性还本付息（复利）
 */
public class CapitalAndInterestAImpl implements ICapitalUtil{

	/**
	 * 本金+总利息
	 * 公式: 投资总额  * (1 + 月利率) ^ 期限
	 * @param dInvestment 投资/借款总额
	 * @param dYearRate 年利率
	 * @param iTotalMonth 投资/借款期限
	 * @return 收益总额（本金+总利息）
	 */
	public static Double totalPayPrincipalAndInsterest(double dInvestment, double dYearRate, int iTotalMonth) {
		if (dInvestment <= 0) return 0.0;
		BigDecimal bdMonthRate = new BigDecimal(dYearRate).divide(new BigDecimal(12), 8, BigDecimal.ROUND_FLOOR);
		//1. 分步计算到期一次性付总额
		// 1 + 月利率
		BigDecimal bdMonthRatePlusOne = new BigDecimal(1).add(bdMonthRate);
		// 计算公式后半部分: (1 + 月利率) ^ 期限
		BigDecimal bdEndFormula = bdMonthRatePlusOne.pow(iTotalMonth);
		// 算出最终本金+利息
		return new BigDecimal(dInvestment).multiply(bdEndFormula).divide(new BigDecimal(1),2,BigDecimal.ROUND_FLOOR).doubleValue();
	}

	/**
	 * 到期一次性还本付息总利息
	 * 公式: 投资总额 * 月利率 * 期限
	 * @ param investment 投资/借款总额
	 * @ param dayRate 利率
	 * @ param term 投资/借款期限
	 * @ return 收益总额（总利息）
	 */
	public static Double totalPayInsterest(double dInvestment, double dYearRate, int iTotalTerm) {
		if (dInvestment <= 0) return 0.0;
		BigDecimal bdMonthRate = new BigDecimal(dYearRate).divide(new BigDecimal(12), 8, BigDecimal.ROUND_FLOOR);
		//计算每天利息
		BigDecimal dbInsterest = new BigDecimal(dInvestment).multiply(bdMonthRate).multiply(new BigDecimal(iTotalTerm));
		//计算总利息
		return dbInsterest.divide(new BigDecimal(1),2,BigDecimal.ROUND_FLOOR).doubleValue();
	}
	
	@Override
	public CapitalVO genCapital(double dInvest,double dYearRate,int iTotalmonth){
		CapitalVO vo = new CapitalVO();
		double perMonthPrincipalInterest = totalPayPrincipalAndInsterest(dInvest, dYearRate, iTotalmonth);
        System.out.println("到期一次性还本付息_复利---应还本息总和：" + perMonthPrincipalInterest);
		Double dInterest = totalPayInsterest(dInvest, dYearRate, iTotalmonth);
        System.out.println("到期一次性还本付息_复利---每月还款利息总和：" + dInterest);
		Map<Integer,Double> keyValueInerest = new HashMap<>();
		keyValueInerest.put(1,dInterest);
		Map<Integer,Double> keyValuePrncInerest = new HashMap<>();
		keyValuePrncInerest.put(1,perMonthPrincipalInterest);
		Map<Integer,Double> keyValuePrnc = new HashMap<>();
		keyValuePrnc.put(1,dInvest);
		vo.setName("到期一次性还本付息_复利");
		vo.setInvest(dInvest);
		vo.setTotalmonth(iTotalmonth);
		vo.setYearRate(dYearRate);
		vo.setMonthCapitalAndInterest(keyValuePrncInerest);
		vo.setMonthInterest(keyValueInerest);
		vo.setMonthCapital(keyValuePrnc);
		vo.setTotalInterest(dInterest);
		return vo;
	}

	public static void main(String[] args) {
		CapitalVO vo = new CapitalAndInterestAImpl().genCapital(1000,0.09,1);
		System.out.println(JsonFormat.format(JSONObject.toJSONString(vo)));
	}
}