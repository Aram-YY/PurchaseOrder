package com.csdj.lyn.entity;

import java.util.List;

public class Orderform {//订单表
	private int did; //订单号
	private String start; //状态
	private int cont_count; //数量
	private String count_money; //总金额
	
	private List<Orderdetailed> objOrderdetailed;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public int getCont_count() {
		return cont_count;
	}

	public void setCont_count(int cont_count) {
		this.cont_count = cont_count;
	}

	public String getCount_money() {
		return count_money;
	}

	public void setCount_money(String count_money) {
		this.count_money = count_money;
	}

	public List<Orderdetailed> getObjOrderdetailed() {
		return objOrderdetailed;
	}

	public void setObjOrderdetailed(List<Orderdetailed> objOrderdetailed) {
		this.objOrderdetailed = objOrderdetailed;
	}
}
