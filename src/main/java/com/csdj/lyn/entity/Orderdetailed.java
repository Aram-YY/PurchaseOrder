package com.csdj.lyn.entity;

public class Orderdetailed {
	private int mid; //明细编号
	private String name; //明细名称
	private String img; //图片地址
	private String price; //单价
	private int mdid; //订单号

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public int getMdid() {
		return mdid;
	}

	public void setMdid(int mdid) {
		this.mdid = mdid;
	}
}
